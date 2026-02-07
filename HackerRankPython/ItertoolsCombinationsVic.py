
## Ejercicio itertools.combinations
## https://www.hackerrank.com/challenges/itertools-combinations/problem?isFullScreen=true

from itertools import combinations

s, k = input().split()
s = sorted(s)

for i in range(int(k)):
    for c in combinations(s, i + 1):
        print(''.join(c))