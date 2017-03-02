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
	int puntos[4];

	int i;

	for(i = 0; i < 4; i++)
	{
		scanf("%d", &puntos[i]);
	}

	while(puntos[0] != 0 && puntos[1] != 0 && puntos[2] != 0 && puntos[3] != 0)
	{
		if(puntos[0] == puntos[2]) //x es el mismo
		{
			if(puntos[1] == puntos[3]) //y es el mismo
			{
				printf("0\n"); //Esta en la misma posicion
			}
			else
			{
				printf("1\n"); //Esta en la misma fila
			}
		}
		else
		{
			if(puntos[1] == puntos[3]) //y es el mismo
			{
				printf("1\n"); //Esta en la misma columna
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


		for(i = 0; i < 4; i++)
		{
			scanf("%d", &puntos[i]);
		}
	}

	return 0;
}
