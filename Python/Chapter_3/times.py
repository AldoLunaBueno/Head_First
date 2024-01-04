import statistics

FOLDER = "swimdata/"
FN = "Darius-13-100m-Fly.txt"

swimmer, age, distance, stroke = FN.removesuffix(".txt").split("-")

with open(FOLDER + FN, "r") as file:
    lines = file.readlines()


times = lines[0].strip().split(",")

time_values = []

for t in times:
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


print(f"Swimmer: {swimmer}")
print(f"Age: {age}")
print(f"Distance: {distance}")
print(f"Stroke: {stroke}")
print(f"Times: {times}")
print(f"Average: {average}")


