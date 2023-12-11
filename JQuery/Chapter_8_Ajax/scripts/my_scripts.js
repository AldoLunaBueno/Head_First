$(document).ready(function() {
    /*
    const FREQ = 10000
    getXMLRacers()
    startAJAXcalls()
    function startAJAXcalls() {
        getXMLRacers()
        setTimeout(startAJAXcalls, FREQ)
    }
    */
   
    const FREQ = 10000
    function startAJAXcalls() {
        setTimeout(
            function() {
                getXMLRacers()
                startAJAXcalls()
            },
            FREQ
        )
   }
   getXMLRacers()
   startAJAXcalls()
})

function getXMLRacers() {
    $.ajax({
        url: "http://localhost:8000/finishers.xml",
        cache: false,
        dataType: "xml",
        success: function(xml) {
            $("#finishers_m").empty()
            $("#finishers_f").empty()
            $("#finishers_all").empty()
            $(xml).find("runner").each(function() {
                let info = "<li>Name: " + $(this).find("fname").text() + " " 
                    + $(this).find("lname").text() + ". Time: " + $(this).find("time").text() + "</li>"
                if ($(this).find("gender").text() == "m") {
                    $("#finishers_m").append(info)
                } else if ($(this).find("gender").text() == "f") {
                    $("#finishers_f").append(info)
                }
                $("#finishers_all").append(info)
            })
            getTime()
        }
    })
}

function getTime() {
    var a_p = "";
    var d = new Date();
    var curr_hour = d.getHours();
    (curr_hour < 12) ? a_p = "AM" : a_p = "PM";
    (curr_hour == 0) ? curr_hour = 12 : curr_hour = curr_hour;
    (curr_hour > 12) ? curr_hour = curr_hour - 12 : curr_hour = curr_hour;
    var curr_min = d.getMinutes().toString();
    var curr_sec = d.getSeconds().toString();
    if (curr_min.length == 1) { curr_min = "0" + curr_min; }
    if (curr_sec.length == 1) { curr_sec = "0" + curr_sec; }
    $('#updated_time').html(curr_hour + ":" + curr_min + ":" + curr_sec + " " + a_p);
}