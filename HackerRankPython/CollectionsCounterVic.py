
## Ejercicio collections.Counter()
## https://www.hackerrank.com/challenges/collections-counter/problem?isFullScreen=true

from collections import Counter

x = int(input())

shoes = Counter(map(int, input().split()))

n = int(input())

earn = 0

for _ in range(n):
    shoe, x = map(int, input().split())
    
    if shoes[shoe] > 0:
        shoes[shoe] -= 1
        earn += x

print(earn)
