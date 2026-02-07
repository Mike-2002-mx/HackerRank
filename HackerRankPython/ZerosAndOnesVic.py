
## Ejercicio Zeros And Ones
## https://www.hackerrank.com/challenges/np-zeros-and-ones/problem?isFullScreen=true

import numpy

l = list(map(int, input().split()))

print(numpy.zeros((l), dtype=int))
print(numpy.ones((l), dtype=int))
