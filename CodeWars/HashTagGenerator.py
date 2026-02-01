
## Ejercicio Sacado de
##  https://www.codewars.com/kata/52449b062fb80683ec000024
## HashTag Generator

def generate_hashtag(s):
    
    if len(s) < 1:
        return False
    
    s = ''.join(list(map(lambda k : k.capitalize(), s.split(' '))))
    
    if len(s) > 139:
        return False

    return '#' + s
