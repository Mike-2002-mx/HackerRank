
## Ejercicio ginortS
## https://www.hackerrank.com/challenges/ginorts/problem?isFullScreen=true

import re
s = input()

lwc = re.findall(r'[a-z]', s)
upc = re.findall(r'[A-Z]', s)
odd = re.findall(r'[13579]', s)
evn = re.findall(r'[24680]', s)

text = ''.join(sorted(lwc) + sorted(upc) + sorted(odd) + sorted(evn))

print(text)
