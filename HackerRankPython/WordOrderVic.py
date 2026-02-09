
## Ejercicio Word Order
## https://www.hackerrank.com/challenges/word-order/problem?isFullScreen=true

n = int(input())

words = {}

for _ in range(n):
    word = input()
    words[word] = words.get(word, 0) + 1

print(len(words))

for k, v in words.items():
    print(f'{v}', end=' ')