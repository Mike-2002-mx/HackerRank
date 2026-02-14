
## Ejercicio DefaultDict Tutorial
## https://www.hackerrank.com/challenges/defaultdict-tutorial/problem?isFullScreen=true

from  collections import defaultdict

n, m = map(int, input().split())

d = defaultdict(list)

for i in range(1, n + 1):
    d[input()].append(i)

for _ in range(m):
    i = input()
    if i in d:
        print(*d[i])
    else:
        print(-1)