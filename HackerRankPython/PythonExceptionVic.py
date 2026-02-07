
## Ejercicio Exceptions
## https://www.hackerrank.com/challenges/exceptions/problem?isFullScreen=true

n = int(input())

for _ in range(n):
    try:
        ab = input()
        a = int(ab.split(' ')[0])
        b = int(ab.split(' ')[1])
        print(a // b)
    except ZeroDivisionError as e:
        print('Error Code:', e)
    except ValueError as e:
        print('Error Code:', e)