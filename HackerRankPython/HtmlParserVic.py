
## Ejercicio HTML Parser - Part 1
## https://www.hackerrank.com/challenges/html-parser-part-1/problem?isFullScreen=true

from html.parser import HTMLParser

class MyHTMLParser(HTMLParser):
    def handle_starttag(self, tag, attrs):
        print("Start :", tag)
        if attrs:
            for k, v in attrs:
                print(f'-> {k} > {v}')

    def handle_endtag(self, tag):
        print("End   :", tag)

    def handle_startendtag(self, tag, attrs):
        print("Empty :", tag)
        if attrs:
            for k, v in attrs:
                print(f'-> {k} > {v}')

n = int(input())

parser = MyHTMLParser()

for _ in range(n):
    parser.feed(input())
