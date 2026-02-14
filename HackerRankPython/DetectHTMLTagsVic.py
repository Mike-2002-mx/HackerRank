
## Ejercicio Detect HTML Tags, Attributes and Attribute Values
## https://www.hackerrank.com/challenges/detect-html-tags-attributes-and-attribute-values/problem?isFullScreen=true

from html.parser import HTMLParser

class MyHTMLParser(HTMLParser):
    def handle_starttag(self, tag, attrs):
        print(tag)
        for k,v in attrs:
            print(f'-> {k} > {v}')

    def handle_startendtag(self, tag, attrs):
        print(tag)
        if attrs:
            for k, v in attrs:
                print(f'-> {k} > {v}')
                
n = int(input())

parser = MyHTMLParser()

for _ in range(n):
    parser.feed(input())
