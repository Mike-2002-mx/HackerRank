
## Ejercicio Lineaar Algebra
## https://www.hackerrank.com/challenges/np-linear-algebra/problem?isFullScreen=true

import numpy

N = int(input())

arr = []
for _ in range(N):
    arr.append(input().split())

matrix = numpy.array(arr,float)
print(round(numpy.linalg.det(matrix), 2))
