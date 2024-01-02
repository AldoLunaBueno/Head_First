# Tarea 1: Extraer los datos del nombre del archivo
# Subtareas:
# a. Obtener el nombre del archivo
# b. Dividir el nombre donde esté el separador "-"
# c. Guardar el nombre del nadador, su grupo de edad, 
#    su distancia y su estilo de nado en variables

# Tarea 2: Procesar los datos del archivo
# Subtareas:
# a. Extraer la primera línea del archivo.
#    (Ignorar la segunda línea).
# b. Dividir la línea donde esté el separador ","
# c. Tomar cada subcadena en formato min:seg.centésimas
#    a un número que represente este tiempo.
# d. Guardar los valores de tiempo en variables
# e. Calcular el promedio de los tiempos
# f. Mostrar las variables del nadador (tarea 1)
#    seguidos por sus tiempos 
#    y su promedio calculado (tarea 2).


# Tarea 1

fn = "Darius-13-100m-Fly.txt" # filename

swimmer, age, distance, stroke = fn.removesuffix(".txt").split("-")

print(swimmer)
print(age)
print(distance)
print(stroke)

# Tarea 2: En el capítulo 3
