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

par = [0 for i in range(5)]
impar = [0 for i in range(5)]
counterPar = 0
counterImpar = 0

for i in range(15):
    n = int( raw_input() )
    if n % 2 == 0:
        par[counterPar] = n
        counterPar += 1
        
        if counterPar == 5:
            for j in range(5):
                print("par[%d] = %d" % (j, par[j]))
            counterPar = 0
    else:
        impar[counterImpar] = n
        counterImpar += 1
        
        if counterImpar == 5:
            for j in range(5):
                print("impar[%d] = %d" % (j, impar[j]))
            counterImpar = 0

for j in range(counterImpar):
    print("impar[%d] = %d" % (j, impar[j]))
    
for j in range(counterPar):
                print("par[%d] = %d" % (j, par[j]))