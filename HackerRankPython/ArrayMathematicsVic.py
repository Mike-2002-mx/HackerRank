
## Ejercicio Array Mathematics
## https://www.hackerrank.com/challenges/np-array-mathematics/problem?isFullScreen=true

import numpy

n, m = map(int, input().split())

a = numpy.array([input().split() for _ in range(n)], int)
b = numpy.array([input().split() for _ in range(n)], int)

print(a + b)
print(a - b)
print(a * b)
print(a // b)
print(a % b)
print(a ** b)