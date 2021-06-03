package Biblioteka;

import java.util.Scanner;

public class Ocene {

	public static void main(String[] args) {
		/* Napisati program koji za tri unete ocene ispisuje srednju vrednost i u
		 * 
		 *  numeričkom i opisnom obliku (opisan oblik - odlican, vrlo dobar, dobar,
		 *   dovoljan, nedovoljan)
		 */

         Scanner sc = new Scanner(System.in);
         System.out.println("Unesite prvi broj");
         double prvBroj= sc.nextDouble();
         
         System.out.println("Unesite drugi broj");
         double drugiBroj= sc.nextDouble();
         
         System.out.println("Unesite treci broj");
         double treciBroj= sc.nextDouble();
        		 
         
		System.out.println("Srednja vrednost vasih brojeva je : "  +  prosecnaVrednost(prvBroj,drugiBroj,treciBroj)); 
		
	}
	public static double prosecnaVrednost(double a,double b,double c) {
		double srednjaVrednost = (a + b + c) / 3;
		if(srednjaVrednost > 4.5) {
			System.out.println("Odlican");
		 return srednjaVrednost;
		}	
	  if   (srednjaVrednost < 3.5);{
				System.out.println("Vrlo Dobar");
				return srednjaVrednost;
	  }
	  
	}
}


	

