
## Ejercicio Any Or All
## https://www.hackerrank.com/challenges/any-or-all/problem?isFullScreen=true

## You are given a space separated list of integers. If all the integers are
## positive, then you need to check if any integer is a palindromic integer.
## Can you solve this challenge in 3 lines of code or less?

n = int(input())
nums = list(map(int, input().split()))
print(all(n > 0 for n in nums) and any(str(n) == str(n)[::-1] for n in nums))
