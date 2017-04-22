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



'''
Este metodo representa el comportamiento de la Busqueda Binaria.
Este comportamiento es recursivo, descartanado siempre la mitad del vector. El vector debe estar ordenado.
@param vector de numeros en el cual se va a buscar
@param valor que se desea buscar dentro del vector
@param punto inferior del segmento sobre el arreglo
@param punto superior del segmento sobre el arreglo
@return el indice donde se encuentra el valor. Si no se encuentra, se retorna -1 como marcador logico
'''    
def binarySearch(self, array, data, lower, higher):
    #Se define la mitad del segmento sobre el cual se esta evaluando
    middle = int ((higher + lower) / 2)
    
    if lower == higher: #Si la cota superior e inferior son la misma, ya no se puede dividir mas el vector
        return middle if array[middle] == data else -1 #Si el valor no es el mismo que el unico que queda, es porque el valor no esta presente en el vector
    else:
        if array[middle] == data: #Se valida si el valor a buscar se encuentra en la mitad del segmento
            return middle #Si es asi, se retorna ese indice y ya no es necesario buscar
        else: #Si no es el valor, hay que realizar una nueva division del vector cambiando los puntos superior e inferior para hacer la busqueda
            if array[middle] > data: #Si el valor es menor que el almacenado en la mitad del segmento, se trabaja con esa mitad en la siguiente iteracion
                return self.binarySearch(array, data, lower, middle)
            else: #Si el valor es mayor que el almacenado en la mitad del segmento, se trabaja con esa mitad en la siguiente iteracion
                return self.binarySearch(array, data, middle + 1, higher)


    
        
        
        
'''
Este metodo representa el comportamiento de la Busqueda por Interpolacion.
Variacion de la busqueda binaria.
@param vector de numeros en el cual se va a buscar
@param valor que se desea buscar dentro del vector
@return el indice donde se encuentra el valor. Si no se encuentra, se retorna -1 como marcador logico
'''    
def interpolationSearch(self, array, data):
    lower =  0 #Limite inferior del segmento
    higher =  len( array ) - 1 #Limite superior del segmento
    index = -1 #Indice inicial por si no se encuentra el valor

    while True: #Buscar hasta que o se encuentre o se determine que no esta
        if lower >= higher or array[lower] == array[higher]: #Impica que no se encontro el valor en el arreglo
            break
  
        #Funcion de Interpolacion, la cual mejora la busqueda binaria original
        middle = lower + ((higher - lower)
                        / (array[higher] - array[lower])) * (data - array[lower])  

        #Se verifica si el valor corresponda a la posicion media en la cual se esta
        if array[middle] == data:
            index = middle #Al encontrar el valor, se guarda el indice y se termina la busqueda
            break
        else: 
            if array[middle] < data: #Si el valor es mayor que la mitad, se busca en el segmento superior
                lower = middle + 1
            elif array[middle] > data: #Si el valor es menor que la mitad, se busca en el segmento inferior
                higher = middle - 1
     
    #Se regresa el indice donde este el elemento, o -1 si no se encuentra 
    return index 