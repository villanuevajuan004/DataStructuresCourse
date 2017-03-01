'''
# Solution for a class exercise.
#
# Created by Msc. Carlos Andres Sierra on February 2014.
# Copyright (c) 2017  Msc. Carlos Andres Sierra. Corporacion Universitaria Minuto de Dios. All rights reserved.
#
# This file is part of DataStructuresCourse.
#
# DataStructureCourse is free software: you can redistribute it and/or modify it under the terms of the
# GNU General Public License as published by the Free Software Foundation, version 2.
'''
#Problem Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1179


even = [0 for i in range(5)] #create vector for even numbers
odd = [0 for i in range(5)] #create vector for odd numbers
counterEven = 0 #counter for the amount of even numbers saved in the array
counterOdd = 0 #counter for the amount of odd numbers saved in the array

#Read all 15 numbers
for i in range(15):
    n = int( raw_input() ) #Save the number from console to n
    if n % 2 == 0: #Ask if n is even or odd
        even[counterEven] = n #Add number to even vector in index based on counter
        counterEven += 1 #Increase the counter of even numbers added to vector
        
        if counterEven == 5: #Is even vector is full?
            for j in range(5): #Loop to move thought even vector 
                print("par[%d] = %d" % (j, even[j])) #//Print each position of even vector
            counterEven = 0  #Reset the counter because vector must be able to save numbers again
    else: #odd
        odd[counterOdd] = n #Add number to odd vector in index based on counter
        counterOdd += 1 #Increase the counter of odd numbers added to vector
        
        if counterOdd == 5: #Is odd vector is full?
            for j in range(5): #Loop to move thought odd vector
                print("impar[%d] = %d" % (j, odd[j])) #Print each position of odd vector
            counterOdd = 0 #Reset the counter because vector must be able to save numbers again

#Print remaining numbers in each both odd and even vectors
for j in range(counterOdd): #Print remaining odd numbers
    print("impar[%d] = %d" % (j, odd[j]))
    
for j in range(counterEven): #Print remaining even numbers
    print("par[%d] = %d" % (j, even[j]))