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
#Problem Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1173


a = int(raw_input())
n = [0 for i in range(10) ]

n[0] = a
print("N[0] = %d" % a)


for i in range(1,10):
    n[i] = n[i - 1] * 2
    print("N[%d] = %d" % (i, n[i]))