
## Ejercicio Set Mutations
## https://www.hackerrank.com/challenges/py-set-mutations/problem?isFullScreen=true

na = int(input())

A = set(map(int, input().split()))

n = int(input())

for _ in range(n):
    line = input().split()
    operation = line[0]
    if operation == 'update':
        S = set(map(int, input().split()))
        A |= S
    if operation == 'intersection_update':
        S = set(map(int, input().split()))
        A &= S
    if operation == 'difference_update':
        S = set(map(int, input().split()))
        A -= S
    if operation == 'symmetric_difference_update':
        S = set(map(int, input().split()))
        A ^= S
        
print(sum(A))