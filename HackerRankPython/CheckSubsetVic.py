
## Ejercicio Check Subset
## https://www.hackerrank.com/challenges/py-check-subset/problem?isFullScreen=true

t = int(input())

for _ in range(t):
    a = int(input())
    aSet = set(map(int, input().split()))
    b = int(input())
    bSet = set(map(int, input().split()))
    print(aSet <= bSet)
