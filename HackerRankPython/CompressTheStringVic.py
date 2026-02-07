
## Ejercicio Compress the String
## https://www.hackerrank.com/challenges/compress-the-string/problem?isFullScreen=true

import itertools
s = list(input())

for key, group in itertools.groupby(s):
    print(f'({len(list(group))}, {key})', end=' ')