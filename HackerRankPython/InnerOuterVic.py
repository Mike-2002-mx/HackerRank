
## Ejercicio Inner and Outer
## https://www.hackerrank.com/challenges/np-inner-and-outer/problem?isFullScreen=true

import numpy

a = numpy.array(input().rstrip().split(), dtype=int)
b = numpy.array(input().rstrip().split(), dtype=int)

print(numpy.inner(a,b))
print(numpy.outer(a,b))
