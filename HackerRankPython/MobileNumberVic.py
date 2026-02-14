
## Ejercicio Standardize Mobile Number Using Decorators
## https://www.hackerrank.com/challenges/standardize-mobile-number-using-decorators/problem?isFullScreen=true

def wrapper(f):
    def fun(l):
        new = []
        for i in l:
            new.append("+91 " + i[-10:-5] + " " + i[-5:])
        return f(new)
    return fun

@wrapper
def sort_phone(l):
    print(*sorted(l), sep='\n')

if __name__ == '__main__':
    l = [input() for _ in range(int(input()))]
    sort_phone(l)
