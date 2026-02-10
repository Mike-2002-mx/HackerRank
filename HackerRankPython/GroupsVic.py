
## Ejercicio Group(), Groups() & Groupdict()
## https://www.hackerrank.com/challenges/re-group-groups/problem?isFullScreen=true

import re

s = input()

occ = re.search(r'([a-zA-Z0-9])\1+', s)

if occ:
    print(occ.group(1))
else:
    print(-1)