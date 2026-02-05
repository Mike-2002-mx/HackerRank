

## Ejercicio Min And Max
## https://www.hackerrank.com/challenges/np-min-and-max/problem?isFullScreen=true

import numpy

n = int(input().split(" ")[0])

arr = []

for i in range(n):
    ar = list(map(int, input().split(" ")))
    arr.append(ar)

array = numpy.array(arr)

arrayMins = numpy.min(array, axis = 1)

arrayMax = numpy.max(arrayMins)

print(arrayMax)