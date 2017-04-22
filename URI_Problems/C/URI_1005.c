/*
# Solution for a class exercise.
#
# Created by Msc. Carlos Andres Sierra on February 2014.
# Copyright (c) 2017  Msc. Carlos Andres Sierra. Corporacion Universitaria Minuto de Dios. All rights reserved.
#
# This file is part of DataStructuresCourse.
#
# DataStructureCourse is free software: you can redistribute it and/or modify it under the terms of the
# GNU General Public License as published by the Free Software Foundation, version 2.
*/

//Problem Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1005

//Standard library to Input and Output mechanisms
#include <stdio.h>

//Main function
int main()
{
	float a, b, x;

	scanf("%f", &a);
	scanf("%f", &b);

	x = (a * 3.5) + (b * 7.5);
	x /= 11;

	printf("MEDIA = %.5f\n", x);

	return 0;
}
