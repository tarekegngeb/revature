package com.revature.tarekegn.assignment1;

import java.util.Arrays;

public class CreatArray {
	public static void main(String[] args) {
		
		int[] arr = new int[11];
		
		for(int i = 0; i<arr.length; i++) {
		arr[i] = (int) (Math.random() * 11);
		}
		DisplayArray(arr);
		DisplaySumOfArray(arr);
		DisplayAllEvenAndOddNumbers(arr);
		SortTheArray(arr);
		AverageSumOfArrays(arr);
		DisplayGreatestAndSmallestNumber(arr);
   }
	public static void DisplayArray(int[] arr) {
		for(int item: arr) {
			System.out.println(arr[item] + " ");
		}
	}
	public static void DisplaySumOfArray(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += i;
			
		}
		System.out.println("The sum of all Array numbers: "+sum);
	}
	public static void DisplayAllEvenAndOddNumbers(int[] arr) {
		int sumE = 0, sumO = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2==0) {
				sumE += arr[i];
		    	System.out.println("Even "+arr[i]);
			}else {
				sumO += arr[i];
				System.out.println("Odd "+ arr[i]);
			}
			
		}
		System.out.println("The sum of all Even numbers is "+sumE);   
		 System.out.println("The sum of all Odd numbers is "+sumO);
		 
		 
   }
	
    public static void SortTheArray(int[] arr) {
    	int temp = 0;
    	System.out.println("The sort of Array in Ascending order: ");
    	for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp; 
                  
               } 
               
            }
            
            System.out.print(arr[i] + " ");
            
            
        } 
    	
    	System.out.println();
    	System.out.println("The sort of Array in Dscending order: ");
    	for (int i = 0; i < arr.length; i++) { 
    		//Arrays.sort(null)
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp; 
                   
               } 
               
            }
            
            System.out.print(arr[i] + " ");
        }    
    	
    }
    public static void AverageSumOfArrays(int[] arr) {
    	int sum = 0;
    	double avg = 0;
    	for(int i = 0; i< arr.length; i++) {
    		sum += arr[i];
    		avg = sum/(arr.length);
    		
    	}
    	System.out.println();
    	System.out.println("The average of the Array is: "+avg);
    
  }
    public static void DisplayGreatestAndSmallestNumber(int[] arr) {
    	int max = arr[0],max1 =arr[1],max2 = arr[2];
    	for(int i = 0; i< arr.length; i++) {
    		if(arr[i] > max && arr[i] > max1 && arr[i] > max2) {
    		max = arr[i];
    		max1 = arr[i];
    		max2 = arr[i];
    	   }
    	
    	}
    	System.out.println("The greatest number of Array: "+ max);
    	System.out.println("The greatest number of Array: "+ max1);
    	System.out.println("The greatest number of Array: "+ max2);
        int min = arr[0], min1 = arr[1],min2 = arr[2];
	    for(int i = 0; i< arr.length; i++) {
			if(arr[i] < min && arr[i] < min1 && arr[i] < min2) {
			min = arr[i];
			min1 = arr[i];
			min2 = arr[i];
		   }
		
		}
		System.out.println("The smallest number of Array: "+ min);
		System.out.println("The smallest number of Array: "+ min1);
		System.out.println("The smallest number of Array: "+ min2);
    } 
}
