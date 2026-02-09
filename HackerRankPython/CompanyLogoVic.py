#!/bin/python3

## Ejercicio Companny Logo
## https://www.hackerrank.com/challenges/most-commons/problem?isFullScreen=true

import math
import os
import random
import re
import sys

if __name__ == '__main__':
    s = list(input().rstrip().replace(' ', ''))
    letters = {}
    
    for i in range(len(s)):
        letters[s[i]] = letters.get(s[i], 0) + 1
    
    sortL = sorted(letters.items(), key=lambda item: (-item[1], item[0]))
    
    for i in sortL[:3]:
        print(f'{i[0]} {i[1]}')
    