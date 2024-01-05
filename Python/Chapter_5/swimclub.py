import statistics
import hfpy_utils
import swimclub

FOLDER = "swimdata/"
CHARTS = "charts/"

def read_swim_data(filename):
    """Return swim data from a file.

    Given the name of a swimmer's file (in filename), 
    extract and process all the required data, 
    then return it to the caller as a tuple.
    """
    swimmer, age, distance, stroke = filename.removesuffix(".txt").split("-")

    with open(FOLDER + filename, "r") as file:
        lines = file.readlines()


    original_times = lines[0].strip().split(",")
    times = original_times[:]
    time_values = []

    for t in times:
        if not ":" in t:
            t = "0:" + t
        min, rest = t.split(":")
        sec, hund = rest.split(".")
        min, sec, hund = int(min), int(sec), int(hund)
        value = 100*60*min + 100*sec + hund
        time_values.append(value)

    average_time = statistics.mean(time_values)
    hund, sec = average_time % 100, average_time // 100
    sec, min = int(sec % 60), int(sec // 60)
    min, sec, hund = str(min), str(sec), str(round(hund))
    average = f"{min}:{sec:0>2}.{hund}"

    return swimmer, age, distance, stroke, original_times, average, time_values

def produce_bar_chart(filename):
    
    (swimmer, age, distance, stroke, 
     times, average, time_values) = swimclub.read_swim_data(filename)
    title = f"{swimmer} (Under {age}) {distance} {stroke}"
    html = f"""<!DOCTYPE html>
    <html>
        <head>
            <title>{title}</title>
        </head>
        <body>
            <h3>{title}</h3>
    """
    svgs = ""
    max_time = max(time_values)
    for _, (t, t_str) in enumerate(zip(time_values[::-1], times[::-1])):
        bar_width = hfpy_utils.convert2range(t, 0, max_time, 0, 400)
        svgs += f"""
            <svg height="30" width="400">
                <rect height="30" width="{bar_width}" style="fill:rgb(0,0,255);"/>
            </svg>{t_str}<br />
    """

    footer = f"""
            <p>Average time: {average}</p>
        </body>
    </html>
    """
    page = html + svgs + footer
    
    save_to = f"{CHARTS}{filename.removesuffix('.txt')}.html"

    with open(f"{save_to}", "w") as sf:
        print(page, file=sf)
    return save_to