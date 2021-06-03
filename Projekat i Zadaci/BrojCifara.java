package Biblioteka;

import java.util.Scanner;

public class BrojCifara {

	public static void main(String[] args) {
		// Napisati program koji ispisuje koliko cifara ima uneti broj n.


		
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Unesite broj");
		    int n = sc.nextInt();
		    int brCifara=0;
		    
		    
		    while(n> 0) {
		    	
		    n  /= 10;
		    brCifara++;
		    }
		  System.out.println("Uneti broj ima "   + brCifara + "cifara");  
		    
		    		
		
	}

}
