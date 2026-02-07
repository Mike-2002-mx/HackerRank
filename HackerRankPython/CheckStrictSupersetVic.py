
## Ejercicio Check Strict Superset
## https://www.hackerrank.com/challenges/py-check-strict-superset/problem?isFullScreen=true

A = set(map(int, input().split()))

N = int(input())

result = True

for _ in range(N):
    currentSet = set(map(int, input().split()))
    if not A >= currentSet:
        result = False
        break
print(result)