
## Ejercicio Calendar Module
## https://www.hackerrank.com/challenges/calendar-module/problem?isFullScreen=true

import calendar
import datetime

mm, dd, yyyy = map(int, input().split())

date = datetime.date(yyyy, mm, dd)

day = calendar.day_name[date.weekday()]

print(day.upper())