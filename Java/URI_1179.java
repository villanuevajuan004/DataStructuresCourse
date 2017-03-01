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

//Libraries to handler writer and reader buffers
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Always the name of class must be "Main"
public class Main {

	/**
	 * Main function on the execution
	 */
	public static void main(String[] args) {
		
		//Buffer to read from console
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		//Buffer to write on the console
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter (System.out));
		
		//Define vectors to save both even and odd numbers
		int[] even = new int[5];
		int[] odd = new int[5];
		
		//Counters of the amount of numbers saved in each vector
		int counterEven = 0, counterOdd = 0, n;
		
		try
		{
			//Read the 15 numbers input from console
			for(int i = 0; i < 15; i++)
			{
				n = Integer.parseInt(br.readLine()); //Save value from console in n variable
				
				if(n % 2 == 0)  //Define if n is even or odd
				{
					even[counterEven] = n; //Add number to even vector in index based on counter
					counterEven++; //Increase the counter of even numbers added to vector
					
					if(counterEven == 5) //Is even vector is full?
					{
						for(int j = 0; j < 5; j++) //Loop to move thought even vector
							bw.write("par[" + j + "] = " + even[j] + "\n"); //Print each position of even vector
						
						counterEven = 0; //Reset the counter because vector must be able to save numbers again
					}
				}
				else //Odd
				{
					odd[counterOdd] = n; //Add number to odd vector in index based on counter
					counterOdd++; //Increase the counter of odd numbers added to vector
					
					if(counterOdd == 5) //Is odd vector is full?
					{
						for(int j = 0; j < 5; j++) //Loop to move thought odd vector
							bw.write("impar[" + j + "] = " + odd[j] + "\n"); //Print each position of odd vector
						
						counterOdd = 0; //Reset the counter because vector must be able to save numbers again
					}
				}
			}
			
			
			//Print remaining numbers in each both odd and even vectors
			
			for(int j = 0; j < counterOdd; j++) //Print remaining odd numbers
				bw.write("impar[" + j + "] = " + odd[j] + "\n");
			
			for(int j = 0; j < counterEven; j++) //Print remaining even numbers
				bw.write("par[" + j + "] = " + even[j] + "\n");
			
			//Send buffer content to the console
			bw.flush();
		}
		catch(Exception ex){}
	}
}