
## Ejercicio Polynomials
## https://www.hackerrank.com/challenges/np-polynomials/problem?isFullScreen=true

import numpy

c = list(map(float, input().split()))

x = float(input())

print(numpy.polyval(c, x))

