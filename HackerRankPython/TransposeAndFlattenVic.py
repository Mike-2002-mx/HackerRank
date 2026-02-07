
## Ejercicio Transpose And Flatten
## https://www.hackerrank.com/challenges/np-transpose-and-flatten/problem?isFullScreen=true

import numpy

n, m = map(int, input().split())

arr = []

for _ in range(n):
    ar = list(map(int, input().split()))
    arr.append(ar)

my_array = numpy.array(arr)

print(my_array.transpose())
print(my_array.flatten())