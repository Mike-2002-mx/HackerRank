
## Ejercicio Validating UID
## https://www.hackerrank.com/challenges/validating-uid/problem?isFullScreen=true

import re

n = int(input())

pattern = r'^(?!.*(.).*\1)(?=(?:.*[A-Z]){2,})(?=(?:.*\d){3,})[A-Za-z0-9]{10}$'

for _ in range(n):
    if re.match(pattern, input()):
        print('Valid')
    else:
        print('Invalid')
