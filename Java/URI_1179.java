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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		
		//Buffer to read from console
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		//Buffer to write on the console
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter (System.out));
		
		int[] par = new int[5];
		int[] impar = new int[5];
		
		int counterPar = 0, counterImpar = 0, n;
		
		try
		{
			for(int i = 0; i < 15; i++)
			{
				n = Integer.parseInt(br.readLine());
				if(n % 2 == 0) //Par
				{
					par[counterPar] = n;
					counterPar++;
					
					if(counterPar == 5)
					{
						for(int j = 0; j < 5; j++)
							bw.write("par[" + j + "] = " + par[j] + "\n");
						
						counterPar = 0;
					}
				}
				else //Impar
				{
					impar[counterImpar] = n;
					counterImpar++;
					
					if(counterImpar == 5)
					{
						for(int j = 0; j < 5; j++)
							bw.write("impar[" + j + "] = " + impar[j] + "\n");
						
						counterImpar = 0;
					}
				}
			}
			
			for(int j = 0; j < counterImpar; j++)
				bw.write("impar[" + j + "] = " + impar[j] + "\n");
			
			for(int j = 0; j < counterPar; j++)
				bw.write("par[" + j + "] = " + par[j] + "\n");
			
			//Send buffer content to the console
			bw.flush();
		}
		catch(Exception ex){}
	}
}