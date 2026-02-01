#!/bin/python3

## Ejercicio sacado de
## https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true
## Bill Division

import math
import os
import random
import re
import sys


def bonAppetit(bill, k, b):
    # Write your code here
    totalsum = sum(bill) - bill[k]
    
    if b == totalsum / 2:
        print('Bon Appetit')
    else:
        print(int(b - (totalsum / 2)))
    

if __name__ == '__main__':
    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    k = int(first_multiple_input[1])

    bill = list(map(int, input().rstrip().split()))

    b = int(input().strip())

    bonAppetit(bill, k, b)
