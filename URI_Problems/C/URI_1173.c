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

//Problem Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1173

//Standard library to Input and Output mechanisms
#include <stdio.h>

//Main function
int main()
{
	int a;
	int n[10];

	scanf("%d", &a);
	n[0] = a;
	printf("N[0] = %d\n", n[0]);
	int i;

	for(i = 1; i < 10; i++)
	{
		n[i] = n[i - 1] * 2;
		printf("N[%d] = %d\n", i, n[i]);
	}

	return 0;
}
