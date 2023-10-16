package assignment28july;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int i=1,n,fact=1 ;
		Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");

         n = s.nextInt();
        for(i=1;i<=n;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+n+" is: "+fact);   
      
    }

	}


