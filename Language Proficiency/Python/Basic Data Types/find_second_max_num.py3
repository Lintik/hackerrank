#!/bin/python3

if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())

    # reduce list to unique elements 
    # sort the list
    # return the -2 element of the list
    m = sorted(set(arr))
    print(m[-2])

    # initialize the max and runner-up to min possible num
    # iterate throught the list 
    # compare each element to max and runner-up
    
