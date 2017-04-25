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

//Libraries to handler writer and reader buffers
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Always the name of class must be "Main"
public class URI_1187 {

	/**
	 * Main function on the execution
	 */
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	String temp = scan.nextLine();
	 
	while(!temp.equals("0 0 0 0"))
	{
		System.out.print(plays(temp) + "\n");
		temp = scan.nextLine();
	}
	}
	 
	public static int plays(String positions)
	{
	String[] numbers = positions.split(" ");
	int x1 = Integer.parseInt(numbers[0]);
	int y1 = Integer.parseInt(numbers[1]);
	int x2 = Integer.parseInt(numbers[2]);
	int y2 = Integer.parseInt(numbers[3]);
	 
	return x1 == x2 ? y1 == y2 ? 0 : 1 : y1 == y2 ? 1 : Math.abs(x2 - x1) == Math.abs(y2 - y1) ? 1 : 2; 
			 
	
	
	}
}