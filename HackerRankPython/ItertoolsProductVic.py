
## Ejercicio itertools.product()
## https://www.hackerrank.com/challenges/itertools-product/problem?isFullScreen=true

import itertools

a = list(map(int, input().split()))
b = list(map(int, input().split()))

lista = list(itertools.product(a,b))

for i in lista:
    print(i, end = ' ')