
## Ejercicio itertools.combinations_with_replacement
## https://www.hackerrank.com/challenges/itertools-combinations-with-replacement/problem?isFullScreen=true

from itertools import combinations_with_replacement

s, k = input().split()

s = sorted(s)

arr = list(combinations_with_replacement(list(s), int(k)))

for i in arr:
    print(''.join(i))
