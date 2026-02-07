
## Ejercicio Piling Up!
## https://www.hackerrank.com/challenges/piling-up/problem?isFullScreen=true

t = int(input())

for _ in range(t):
    n = int(input())
    blocks = list(map(int, input().split(' ')))
    result = True
    top = max(blocks[0], blocks[-1])
    
    for i in range(n):
        if blocks[0] > blocks[-1] and blocks[0] <= top:
            top = blocks[0]
            blocks.pop(0)
        elif blocks[-1] >= blocks[0] and blocks[-1] <= top:
            top = blocks[-1]
            blocks.pop(-1)
        else:
            result = False
            break
        
            
    print('Yes' if result else 'No')
