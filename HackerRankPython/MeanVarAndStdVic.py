
## Ejercicio Mean, Var And Std
## https://www.hackerrank.com/challenges/np-mean-var-and-std/problem?isFullScreen=true

import numpy

n, m = map(int, input().split())

arr = []

for _ in range(n):
    ar = list(map(int, input().split()))
    arr.append(ar)
    
my_array = numpy.array(arr)

print(numpy.mean(my_array, axis = 1))
print(numpy.var(my_array, axis = 0))
print(round(numpy.std(my_array), 11))