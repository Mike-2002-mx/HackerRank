
## Ejercicio Map And Lambda Function
## https://www.hackerrank.com/challenges/map-and-lambda-expression/problem?isFullScreen=true

cube = lambda x: x ** 3# complete the lambda function

def fibonacci(n):
    if n == 0:
        return []
    if n == 1:
        return [0]
    if n == 2:
        return [0, 1]
        
    result = [0, 1]

    for i in range(2, n):
        n3 = result[-1] + result[-2]
        result.append(n3)
    return result
        

if __name__ == '__main__':
    n = int(input())
    print(list(map(cube, fibonacci(n))))
