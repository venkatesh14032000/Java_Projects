package com.inter;

public class Same_Array {
	public static void main(String[] args) {
		Integer[] a1= {1,2,3,4,5};
		Integer[] a2= {1,2,3,4,5};
		boolean result=true;
		if(a1.length==a2.length) {
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
					result= false;
				}
				else {
					result=true;
				}
			}
			
		}
		if (result == true) { 
            
            // Print the result 
            System.out.println("Arrays are equal"); 
        } 
        else { 
            // Print the result 
            System.out.println("Arrays are not equal"); 
        } 
		
		

	}

}
