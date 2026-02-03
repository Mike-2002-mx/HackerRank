
## Ejercicio sacado de
## https://www.hackerrank.com/challenges/symmetric-difference/problem?isFullScreen=true
## Sets - Symmetric Difference

## Given 2 sets of integers, M and N, print their symmetric difference in ascending order.
## The term symmetric difference indicates those values that exist in either M or N but do
## not exist in both


m = int(input())
a = set(list(map(int, input().split(' '))))

n = int(input())
b = set(list(map(int, input().split(' '))))

c = list(a.difference(b)) + list(b.difference(a))

c.sort()

for i in c:
    print(i)
