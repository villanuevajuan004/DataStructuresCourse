import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Vector;

/*
# Solution for a class exercise.
#
# Created by Msc. Carlos Andres Sierra on February 2017.
# Copyright (c) 2017  Msc. Carlos Andres Sierra. Research Group on Artificial Life - ALIFE. All rights reserved.
#
# This file is part of TheoryOfComputation course.
#
# TheoryOfComputationCourse is free software: you can redistribute it and/or modify it under the terms of the
# GNU General Public License as published by the Free Software Foundation, version 2.
*/


/**
 * This class represents the behavior of several sort algorithms
 * @author MSc. Carlos Andres Sierra, PhD. student
 */
public class Sorts {
	
	
	/**
	 * This method read a set of numbers from the console and save them inside an array in  integer format
	 * @return set of numbers
	 */
	public static int[] leer_int()
	{
		int[] array = null; //Create array
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in) ); //Create buffer to read from console
		
		//We need try/catch to use buffers
		try
		{
			//The numbers must be written in just one line separated by a empty space
			String[] input = br.readLine().split(" "); //Save numbers in input separated by empty space, using split function to save each number in a different position of the array
			array = new int[input.length]; //Create an array of a size depending of the amount of numbers in input
			
			for(int i = 0; i < input.length; i++) //Convert each number of the array from string to integer
				array[i] = Integer.parseInt( input[i] );
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
		return array; //Array with the set of numbers written in console
	}
	

	/**
	 * This method is used to print an array of numbers
	 * @param array
	 */
	public static void print(int[] array)
	{
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter (System.out) ); //Buffer to print in console
		
		//We need try/catch to use buffers
		try
		{
			for(int i = 0; i < array.length; i++) //Move through all the array
			{
				bw.write(array[i] + " "); //Add numbers to the buffer
			}
			bw.write("\n"); //Add a jump of line to the buffer
			bw.flush(); //Move all content of the buffer to console
		}
		catch(Exception ex){}
	}
	
	
	public static int[] quickSort(int[] numbers)
	{
		Vector<Integer> numbersDyn = new Vector<Integer>();
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbersDyn.add( numbers[i] );
		}
		
		Vector<Integer> numbersOrdered = quickSort(numbersDyn);
		
		int[] ordered = new int[numbers.length];
		for(int i = 0; i < numbersDyn.size(); i++)
		{
			ordered[i] = numbersOrdered.get(i);
		}
		
		return ordered;
	}
	
	public static Vector<Integer> quickSort(Vector<Integer> numbers)
	{
		if(numbers.size() <= 1)
		{
			return numbers;
		}
		else
		{
			int pivot = numbers.get(0);
			Vector<Integer> less = new Vector<Integer>();
			Vector<Integer> greater = new Vector<Integer>();
		
			Vector<Integer> result = new Vector<Integer>();
			
			for(int i = 1; i < numbers.size(); i++)
			{
				if(numbers.get(i) > pivot)
				{
					greater.add( numbers.get(i) );
				}
				else
				{
					less.add( numbers.get(i) );
				}
			}
			
			result.addAll( quickSort(less) );
			result.add(pivot);
			result.addAll( quickSort(greater) );
			
			return result;
		}
	} 
	
	
	/**
	 * Method for traditional Merge Sort 
	 * @param array
	 * @return ordered array 
	 */
	public int[] sort(int[] array)
	{
		if(array.length > 1) //Condition to end recursive: If array is of size equal to 1, no more calls are necessary
		{
			int n = array.length / 2; //Get half size of the array
			int[] array_left = new int[n]; //Create array of the left side of n size
			int[] array_right = new int[array.length - n]; //Create array of the right side 
			
			for(int i = 0; i < n; i++) //Copy first half of the array inside left array
				array_left[i] = array[i]; //Copy data
			
			for(int i = 0; i < array_right.length; i++) //Copy second half of the array inside right array
				array_right[i] = array[n + i]; //Copy data
			
			array_left = sort(array_left); //Call recursive to order array of left size
			array_right = sort(array_right); //Call recursive to order array of left size
			
			return merge(array_left, array_right); //Merge order arrays of both left and right size
		}
		else
		{
			return array; //Return array if his size is 1 
		}
	}

	
	/**
	 * This method merge both left and right arrays in an ordered way 
	 * @param array_left
	 * @param array_right
	 * @return ordered array base on both left and right array
	 */
	public int[] merge(int[] array_left, int[] array_right)
	{
		int[]temp = new int[array_left.length + array_right.length]; //Create array of complete size, i.e. size of left array plus size of right array
		int left = 0, right = 0, index = 0; //Index for: left array, right array, and temp array. All must start in zero.
		
		while(left < array_left.length && right < array_right.length) //While are still elements inside left array or right array, we can made comparisons
		{
			if(array_left[left] <= array_right[right]) //If element in left array is minor or equal to element in right array
			{
				temp[index] = array_left[left]; //Add element of left array
				left += 1; //Because we add an element of left array, index that control left array must increase
			}
			else
			{
				temp[index] = array_right[right]; //Add element of right array
				right += 1; //Because we add an element of right array, index that control right array must increase
			}
			
			index += 1; //Increase index of complete array
		}
		
		if(left < array_left.length) //If there are still element in left array
			for(int i = left; i < array_left.length; i++) //Add all elements of left array
			{
				temp[index] = array_left[left]; //Add element
				left += 1; //Increase index over left array
				index += 1; //Increase index over complete array
			}	
		else //If there are still element in left array
			for(int i = right; i < array_right.length; i++) //Add all elements of right array
			{
				temp[index] = array_right[right]; //Add element
				right += 1; //Increase index over right array
				index += 1;  //Increase index over complete array
			}	
		
		return temp; //Return complete array 
	}
	
	
	public static void  main(String[] args)
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input;
		String[] input_split;
		int[] numbers, sorted;
		
		try
		{
			input = br.readLine();
			input_split = input.split(",");
			
			numbers = new int[input_split.length];
			sorted = new int[input_split.length];
			
			for(int i = 0; i < input_split.length; i++)
			{
				numbers[i] = Integer.parseInt( input_split[i] );
			}
			
			sorted = quickSort(numbers);
			
			for(int i = 0; i < input_split.length; i++)
			{
				System.out.print(sorted[i] + ",");
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}