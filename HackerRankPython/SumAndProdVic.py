
## Ejercicio Sum And Prod
## https://www.hackerrank.com/challenges/np-sum-and-prod/problem?isFullScreen=true

import numpy

n, m = map(int, input().split())

arr = []

for _ in range(n):
    ar = list(map(int, input().split()))
    arr.append(ar)

my_array = numpy.array(arr)

my_array = numpy.sum(my_array, axis = 0)

print(numpy.prod(my_array))
