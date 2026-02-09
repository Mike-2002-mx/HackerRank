
## Ejercicio input()
## https://www.hackerrank.com/challenges/input/problem?isFullScreen=true

x, k = map(int, input().split())

p = input()

result = eval(p)

print(result == k)