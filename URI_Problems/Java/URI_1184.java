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

//Problem Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1184

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class URI_1184
{
 	public static void main(String[] args)
    {
   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("#.0");
           
        try
        {
        	String op = br.readLine();
        	double result = 0.0;
        	
        	for(int i = 0; i < 12; i++)
        	{
        		for(int j = 0; j < 12; j++)
            	{
        			if(j < i)
        			{
        				result += Double.parseDouble(br.readLine()); 
        			}
        			else
        			{
        				br.readLine();
        			}
            	}
        	}
        	
        	if(op.equals("M"))
        	{
        		result /= 66.0;
        	}
        	
        	log.write(df.format(result) + "\n");
        	log.flush();
        	
            br.close();
        }
        catch(Exception ex){}
    }
}