import statistics

FOLDER = "swimdata/"

def read_swim_data(filename):
    swimmer, age, distance, stroke = filename.removesuffix(".txt").split("-")

    with open(FOLDER + filename, "r") as file:
        lines = file.readlines()


    times = lines[0].strip().split(",")

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
    average = f"{min}:{sec}.{hund}"

    return swimmer, age, distance, stroke, times, average