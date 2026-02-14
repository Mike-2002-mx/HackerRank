
## Ejercicio XML 1 - Find the Score
## https://www.hackerrank.com/challenges/xml-1-find-the-score/problem?isFullScreen=true

import sys
import xml.etree.ElementTree as etree

def get_attr_number(node):
    cc = len(node.attrib)
    
    for child in node:
        cc += get_attr_number(child)
    return cc

if __name__ == '__main__':
    sys.stdin.readline()
    xml = sys.stdin.read()
    tree = etree.ElementTree(etree.fromstring(xml))
    root = tree.getroot()
    print(get_attr_number(root))
