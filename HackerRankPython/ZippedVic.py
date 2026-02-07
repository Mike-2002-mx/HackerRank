
## Ejercicio Zipped
## https://www.hackerrank.com/challenges/zipped/problem?isFullScreen=true

nx = input().split()

x = int(nx[1])

arr = []

for _ in range(x):
    cArr = list(map(float, input().split()))
    arr.append(cArr)

arr = list(zip(*arr))

for i in arr:
    print(sum(i) / x)
