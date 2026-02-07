
## Ejercicio itertools.permutations()
## https://www.hackerrank.com/challenges/itertools-permutations/problem?isFullScreen=true

import itertools

s, k = map(str, input().split())

arr = list(itertools.permutations(list(s), int(k)))

arr.sort()

for i in arr:
    print(''.join(i))