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

//Problem Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1187

//Standard library to Input and Output mechanisms
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
	int points[4]; //Array to save two Cartesian Coordinates

	int i; //Variable to management the array index

	//Read for values: x1 (index 0), y1 (index 1), x2 (index 2), y2 (index 3)
	for(i = 0; i < 4; i++)
	{
		scanf("%d", &puntos[i]); //Save each value inside the array
	}


	//The program must end when all values are equals to zero
	while(puntos[0] != 0 && puntos[1] != 0 && puntos[2] != 0 && puntos[3] != 0)
	{
		if(puntos[0] == puntos[2]) //Verify if z1 and x2 are the same
		{
			if(puntos[1] == puntos[3]) //Verify if y1 and y2 are the same
			{
				printf("0\n"); //Points are the same
			}
			else
			{
				printf("1\n"); //Points are on the same row
			}
		}
		else
		{
			if(puntos[1] == puntos[3]) //Verify if y1 and y2 are the same
			{
				printf("1\n"); //Points are on the same column
			}
			else
			{

				if( abs(puntos[2] - puntos[0]) == abs(puntos[3] - puntos[1]) ) //Diagonal
				{
					printf("1\n");
				}
				else
				{
					printf("2\n");
				}
			}
		}

		//Read again x1, y1, x2, y2
		for(i = 0; i < 4; i++)
		{
			scanf("%d", &puntos[i]); //Save each point inside the array
		}
	}

	return 0;
}
