package com.mywork.examples;

/**
 * Apple Coding Interview Question
 *
 *
 */
class Solution {

	  private static int getMaxSum(final Integer[] array) {
		 if(array!=null & array.length>0){
			 int finalSum=0;
			    for(int i: array){
			       if(finalSum<0){
			         finalSum=0;
			         finalSum=finalSum+i;
			       }else{
			         finalSum=finalSum+i;
			       }
			  }
			    return finalSum; 
		 }
	    return 0;
	  }
	  
	  public static void main(String...arg) {
	    Integer[] array ;
	    
	    array = new Integer[] {1, 2, 3};   //6
	    System.out.println(getMaxSum(array));
	    
	    array = new Integer[] {9, -10, 1, 2, 3, 4};   //10
	    System.out.println(getMaxSum(array));
	    
	    array = new Integer[] {-5, 1, 2, 3, 4, -10, 12};   //12
	    System.out.println(getMaxSum(array));
	  }
	}

