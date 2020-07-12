
import java.io.*;
import java.math.*;
import java.util.*;


public class Removeduplicates {

	public static void main (String args[])
	{
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		
		 
        int numssize = nums.length;
		 int k=0;
		 int j=0;
		 
		 if (numssize > 0 )
		 {
		 nums[k] = nums[j];
		 System.out.println("arr[k] : " + nums[k]);
			 for (j = 0; j < numssize ; j++)
			 {	   
                
               if ( (nums[k] != nums[j])  && (k <= j))
				     {               
            	        System.out.println("arr[j] : " + nums[j]);
				        k++;
				        nums[k] = nums[j];
				    	System.out.println("arr[k] **: " + nums[k]);
				     }
	    	 }
			 System.out.println("arr[k] *****: " + (k+1));
			 //Return k + 1;
           		
      		
			}
		 else
		 {
			 System.out.println("Return Zero");
		   //return 0;
		 }
		 
		 }
}
