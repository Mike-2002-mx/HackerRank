
## Ejercico
## https://www.hackerrank.com/challenges/no-idea/problem?isFullScreen=true
## No Idea!

## There is an array of n integers. There are also 2 disjoint sets, A and B,
## each containing m integers. You like all the integers in set A and dislike
## all the integers in set B. Your initial happiness is 0. For each i integer
## in the array, if i in A, you add 1 to your happiness. If i in B, you add -1
## to your happiness. Otherwise, your happiness does not change.
## Output your final happiness at the end.

mn = input() ## Size of arr m and sets n

arr = input().split(' ')

a = set(input().split(' '))
b = set(input().split(' '))

happiness = 0

for i in arr:
    if i in a:
        happiness += 1
    if i in b:
        happiness -= 1
        
print(happiness)