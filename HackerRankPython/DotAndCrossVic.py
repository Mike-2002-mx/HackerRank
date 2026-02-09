
## Ejercicio Dot And Cross
## https://www.hackerrank.com/challenges/np-dot-and-cross/problem?isFullScreen=true

import numpy

n = int(input())

arr = []
for _ in range(n):
    arr.append(list(map(int, input().split())))
    
arrA = numpy.array(arr)

arr = []

for _ in range(n):
    arr.append(list(map(int, input().split())))
    
arrB = numpy.array(arr)

print(arrA @ arrB)