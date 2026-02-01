
## Ejercicio sacado de
## https://www.codewars.com/kata/55f2b110f61eb01779000053
## Suma de números

## Given two integers a and b, which can be positive or negative,
## find the sum of all the integers between and including them and
## return it. If the two numbers are equal return a or b.

def get_sum(a,b):
    
    if a == b:
        return a
    
    max = a if a > b else b
    min = a if a < b else b
    
    sum = 0
    for i in range(min, max + 1):
        sum += i
    
    return sum