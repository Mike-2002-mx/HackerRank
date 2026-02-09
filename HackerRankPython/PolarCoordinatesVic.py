
## Ejercicio Polar Coordinates
## https://www.hackerrank.com/challenges/polar-coordinates/problem?isFullScreen=true

import cmath

complex_number = complex(input())

r, phi = cmath.polar(complex_number)

print(r)
print(phi)