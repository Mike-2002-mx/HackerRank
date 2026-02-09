
## Ejercicio Floor, Ceil and Rint
## https://www.hackerrank.com/challenges/floor-ceil-and-rint/problem?isFullScreen=true

import numpy

numpy.set_printoptions(legacy="1.13")

array = numpy.array(input().split(), dtype = float)

print(numpy.floor(array))
print(numpy.ceil(array))
print(numpy.rint(array))