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

//Libraries to handler writer and reader buffers
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Always the name of class must be "Main"
public class URI_1173 {

	/**
	 * Main function on the execution
	 */
	public static void main(String[] args) {
		
		//Buffer to read from console
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		//Buffer to write on the console
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter (System.out));
		
		try
        {
        	int n = Integer.parseInt(br.readLine());
        	
        	for(int i = 0; i < 10; i++)
        	{
        		log.write("N[" + i + "] = " + n + "\n");
        		n *= 2;
        	}
        	
        	log.flush();
        }
        catch(Exception ex)  {}
	}
}