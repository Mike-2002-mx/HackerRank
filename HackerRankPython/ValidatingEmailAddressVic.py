
## Ejercicio Validating and Parsing Email Addresses
## https://www.hackerrank.com/challenges/validating-named-email-addresses/problem?isFullScreen=true

import email.utils
import re

n = int(input())

for _ in range(n):
    add = input()
    name, address = email.utils.parseaddr(add)
    if re.match(r'^[a-zA-Z][\w\.-]*@[a-zA-Z]+\.[a-zA-Z]{1,3}$', address):
        print(add)