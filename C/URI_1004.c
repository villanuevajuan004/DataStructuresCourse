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

//Problem Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1004

//Standard library to Input and Output mechanisms
#include <stdio.h>

//Main function
int main()
{
	int a, b, prod;

	scanf("%d", &a);
	scanf("%d", &b);

	prod = a * b;

	printf("PROD = %d\n", prod);

	return 0;
}
