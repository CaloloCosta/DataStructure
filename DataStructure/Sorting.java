package DataStructure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class Sorting <E>{

    // array of integers
    static public void inserctionSort(int[] arr){
        int key, j;
        for(int i = 1; i <= arr.length; i++){
            j = i - 1;
            key = arr[i];
            while(j >= 0 && arr[j] > key){
               arr[j + 1] = arr[j];
               j--;  
            }
            arr[j + 1] = key;
        }  
    
    }
    
    static public void printArray(int[] arr){
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    
    
    
}
