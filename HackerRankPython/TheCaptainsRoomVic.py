
## Ejercicio The Captain's Room
## https://www.hackerrank.com/challenges/py-the-captains-room/problem?isFullScreen=true

n = int(input())

a = list(map(int, input().split()))

rooms = {}

for i in range(len(a)):
    rooms[a[i]] = rooms.get(a[i], 0) + 1

for k,v in rooms.items():
    if v == 1:
        print(k)
        break
