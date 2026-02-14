
## Ejercicio Hex Color Code
## https://www.hackerrank.com/challenges/hex-color-code/problem?isFullScreen=true

import re

n = int(input())

pattern = r'(#[0-9a-f]{3}|#[0-9a-f]{6})(?=[;,)])'

for _ in range(n):
    line = input()
    arr = re.findall(pattern, line, flags=re.I)
    if arr:
        for c in arr:
            print(c)
