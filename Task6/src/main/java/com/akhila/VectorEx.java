package com.akhila;

	import java.io.*; 
	import java.util.*;
	@SuppressWarnings("unused")
	public class VectorEx {
		 
		// Java program to show why collection framework was needed 
		 
		  
	 
		    @SuppressWarnings("unchecked")
			public static void main (String[] args) 
		    { 
		       
		        int arr[] = new int[] {1, 2, 3, 4}; 
		        @SuppressWarnings("rawtypes")
				Vector<Integer> v = new Vector(); 
		       
		        v.addElement(1); 
		        v.addElement(2); 
		        v.addElement(3);
		        
		
		        System.out.println(arr[0]); 
		        System.out.println(v.elementAt(0));
		        System.out.println(v.elementAt(3));
		        System.out.println(v.elementAt(8));

		  
	
		    } 
		} 




