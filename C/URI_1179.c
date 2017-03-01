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

//Problem Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1179

//Standard library to Input and Output mechanisms
#include <stdio.h>

//Main function
int main()
{
	//Define all variables: even and odd vectors, counters for each array, and two variables for loops control
	int even[5], odd[5], n, counterEven = 0, counterOdd = 0, i, j;

	//Read the 15 numbers input from console
	for(i = 0; i < 15; i++)
	{
		scanf("%d", &n); //Save value from console in n variable

		if(n % 2 == 0) //Define if n is even or odd
		{
			even[counterEven] = n; //Add number to even vector in index based on counter
			counterEven++; //Increase the counter of even numbers added to vector

			if(counterEven == 5) //Is even vector is full?
			{
				for(j = 0; j < 5; j++) //Loop to move thought even vector
					printf("par[%d] = %d\n", j, even[j]); //Print each position of even vector

				counterEven = 0; //Reset the counter because vector must be able to save numbers again
			}
		}
		else //odd
		{
			even[counterOdd] = n; //Add number to odd vector in index based on counter
			counterOdd++; //Increase the counter of odd numbers added to vector

			if(counterOdd == 5) //Is odd vector is full?
			{
				for(j = 0; j < 5; j++) //Loop to move thought odd vector
					printf("impar[%d] = %d\n", j, odd[j]); //Print each position of odd vector

				counterOdd = 0; //Reset the counter because vector must be able to save numbers again
			}
		}
	}

	//Print remaining numbers in each both odd and even vectors

	for(j = 0; j < counterOdd; j++) //Print remaining odd numbers
		printf("impar[%d] = %d\n", j, odd[j]);

	for(j = 0; j < counterEven; j++) //Print remaining even numbers
		printf("par[%d] = %d\n", j, even[j]);

	return 0;
}
