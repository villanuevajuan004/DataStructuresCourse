'''
# Solution for a class exercise.
#
# Created by Msc. Carlos Andres Sierra on February 2017.
# Copyright (c) 2017  Msc. Carlos Andres Sierra. Research Group on Artificial Life - ALIFE. All rights reserved.
#
# This file is part of DataStructures course.
#
# DataStructuresCourse is free software: you can redistribute it and/or modify it under the terms of the
# GNU General Public License as published by the Free Software Foundation, version 2.
'''

#This method represents the behavior of a Bubble Sort algorithm
# As parameter the algorithm receives an unsorted array of numbers
def bubbleSort(unsorted):
    sorted = unsorted #make a copy of original array
    n = len(unsorted) #save the length of the array to sort
    
    #Move through the unsorted array from 0 to n-1 (exclusive) elements
    for i in range(n - 1):
        swap = False #It is assumed that in each iteration there is no swap at the beginning 
        for j in range(n - 1):
            if sorted[j] > sorted[j + 1]: #compare number with forward adjacent element
                #Make swap between numbers
                auxSwap = sorted[j]
                sorted[j] = sorted[j + 1]
                sorted[j + 1] = auxSwap
                
                swap = True #make the annotation  of a swap in the iteration
                
        if not swap: #if there was no swap, the algorithm is finished
            break
    
    return sorted #return sorted array


def insertionSort( numeros ):
    for i in range( len(numeros) ):
        x = numeros[i]
        index = i
        
        while(index > 0 and numeros[index - 1] > x):
            numeros[index] = numeros[index - 1]
            index -= 1
        
        numeros[index] = x
        
    return numeros


'''
Este metodo representa el comportamiento de Quicksort. 
El comportamiento es recursivo, y el manejo de arreglos en Python es similar a usar el Vector de Java.
@param vector de numeros a ordenar
@return: vector de numeros ordenado 
'''    
def quickSort(self, numbers):
    if len( numbers ) == 1: #Si solo hay un elemento se retorna el elemento minimo de la recursividad
        return numbers
    else: #si hay mas de un elemento, se debe aplicar la recursividad de QuickSort
        arrayLower = [] #Vector que almacenara los numeros menores al pivote
        arrayHigher = [] #Vector que almacenara los numeros mayores al pivote
        
        for i in range(1, len( numbers ), 1): #Se recorre el vector de numeros a dordenar omitiendo el primero, puesto que se toma como pivote
            if numbers[i] < numbers[0]: #Si el numero es menor se agrega al vector de menores
                arrayLower.append( numbers[i] ) #En Python el .append es el equivalente al .add de Java
            else: #Si es mayor, se agrega al vector de mayores
                arrayHigher.append( numbers[i] )
        
        arrayOrder = [] #Se crea un vector que va a almacenar el listado de numeros ya ordenado
        
        if len( arrayLower ) > 0: #Si hay elementos en el vector de menores, se agregan
            arrayOrder.extend( self.quickSort( arrayLower ) ) #Como se debe hacer la recursividad con cada una de las divisiones, se agrega al vector final el vector que tiene los menores al pivote ya ordenados
        
        arrayOrder.append( numbers[0] ) #Se agrega el pivote
        
        if len( arrayHigher ) > 0: #Si hay elementos en el vector de mayores, se agregan
            arrayOrder.extend( self.quickSort( arrayHigher ) ) #Se ordena el vector de mayores invocando la recursividad, y se agrega al vector completo
        
        #Recursivamente se tendra el vector de numeros ordenado, en este punto solo se debe retornar el vector que une a menores, pivote, y mayores
        return arrayOrder
