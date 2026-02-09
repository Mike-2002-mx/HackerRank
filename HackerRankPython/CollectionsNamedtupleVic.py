
## Ejercicio Collections.namedtuple()
## https://www.hackerrank.com/challenges/py-collections-namedtuple/problem?isFullScreen=true

from collections import namedtuple
N = int(input())
students = []
columns = input().split()
total = 0
Student = namedtuple('Student', columns)

for _ in range(N):
    data = Student(*input().split())
    total += float(data.MARKS)
    
print(f'{total / N:.2f}')