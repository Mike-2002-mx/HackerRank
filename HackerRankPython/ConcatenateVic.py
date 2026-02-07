
## Ejercicio Concatenate
## https://www.hackerrank.com/challenges/np-concatenate/problem?isFullScreen=true

import numpy

n, m, p = map(int, input().split())

arrNP = []
arrMP = []

for _ in range(n):
    ar = list(map(int, input().split()))
    arrNP.append(ar)

for _ in range(m):
    ar = list(map(int, input().split()))
    arrMP.append(ar)

arrayNP = numpy.array(arrNP)
arrayMP = numpy.array(arrMP)

print(numpy.concatenate((arrayNP, arrayMP), axis = 0))