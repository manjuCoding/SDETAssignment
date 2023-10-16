package testArray;
import java.util.Scanner;

public class evenodd {
	

	    public static void main(String[] args) {
	   
	        int no[]=new int[50];  //array size is 50
	        int n;
	        int countEven=0, countOdd=0;
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter ur choice of no");
	        n=sc.nextInt();   //want to enter 10 elements
	       
	        System.out.println("enter elements now");
	       
	        for(int i=0;i<n;i++) //accept elements one by one  
	        {
	            no[i]=sc.nextInt();  
	        }
	      
	        for(int i=0;i<n;i++)
	        {
	        	if (no[i]%2==0)
	        	
	          
	        		countEven++;
	              
	        
	        	else 
	        		
	        		countOdd++;	
	        	}
	        	  System.out.println("\nNumber of even elements :" +countEven);
	        	  System.out.println("\nNumber of odd element:" +countOdd);
	        			
	        }
	   
}

