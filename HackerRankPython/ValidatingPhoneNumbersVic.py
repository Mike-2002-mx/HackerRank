
## Ejercicio Validating Phone Numbers
## https://www.hackerrank.com/challenges/validating-the-phone-number/problem?isFullScreen=true

import re

n = int(input())

regex = r'^[789][0-9]{9}$'

for _ in range(n):
    number = input()
    print('YES' if re.match(regex, number) is not None else 'NO')
