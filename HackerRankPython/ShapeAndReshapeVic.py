
## Ejercicio Shape And Reshape
## https://www.hackerrank.com/challenges/np-shape-reshape/problem?isFullScreen=true

import numpy

arr = numpy.array(list(map(int, input().split())))
arr.shape = (3,3)
print(arr)
