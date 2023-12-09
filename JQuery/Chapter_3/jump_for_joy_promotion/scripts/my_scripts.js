$(document).ready(function () {    
    let hideCode = function () {
        let numRand = getRandom(4)
        $(".guess_box").each(function(index) {
            if (numRand == index) {
                $(this).append("<span id='has_discount'><span/>")
                return false
            }
        })
    }

    function checkForCode() {
        let discount_msg
        if ($.contains(this, document.getElementById("has_discount"))) {
            let discount = getRandom(100)+1
            discount_msg = "<p>Your code: CODE" + discount + "%</p>"
        } else {
            discount_msg = "<p>Sorry, no discount this time</p>"
        }
        $(".guess_box").each(function () {
            if ($.contains(this, document.getElementById("has_discount"))) {
                $(this).addClass("discount")
            } else {
                $(this).addClass("no_discount")
            }
        })

        $("#result").append(discount_msg)
        
        $(".guess_box").unbind("click")
    }


    $(".guess_box").click(checkForCode)
    hideCode()

    $(".guess_box").hover(
        function () {
            $(this).addClass("my_hover")
        },
        function () {
            $(this).removeClass("my_hover")
        }
    )
})



function getRandom(num) {
    return Math.floor(Math.random() * num)
}