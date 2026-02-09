
## Ejercicio Collections.OrderedDict
## https://www.hackerrank.com/challenges/py-collections-ordereddict/problem?isFullScreen=true

from collections import OrderedDict

N = int(input())

items = OrderedDict()

for _ in range(N):
    *name, prize = input().split()
    items[' '.join(name)] = items.get(' '.join(name), 0) + int(prize)

for key, value in items.items():
    print(f'{key} {value}')