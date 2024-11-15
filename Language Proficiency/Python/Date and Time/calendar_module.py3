#!/bin/python3

import datetime

print(datetime.datetime.strptime(input(), '%m %d %Y').strftime('%A').upper())