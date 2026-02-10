
## Ejercicio Re.findall() & Re.finditer()
## https://www.hackerrank.com/challenges/re-findall-re-finditer/problem?isFullScreen=true

import re

S = input()

pattern = r'(?<=[^aeiouAEIOU])([aeiouAEIOU]{2,})(?=[^aeiouAEIOU])'

substrings = re.findall(pattern, S)

if substrings:
    for sbstr in substrings:
        print(sbstr)
else:
    print(-1)