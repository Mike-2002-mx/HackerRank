
## Ejjercicio Re.start() & Re.end()
## https://www.hackerrank.com/challenges/re-start-re-end/problem?isFullScreen=true

import re

S = input()
k = input()

stt = 0
end = -1

m = re.search(k, S)

if not m:
    print((-1,-1))
else:
    while m:
        end = stt + m.end() - 1
        stt = stt + m.start() + 1
        print((stt - 1, end))
        m = re.search(k, S[stt:])