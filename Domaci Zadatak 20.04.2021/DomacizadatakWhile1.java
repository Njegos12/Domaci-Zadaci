package DomaciZadatak20_04_2021;

import java.util.Scanner;

public class DomacizadatakWhile1 {

	public static void main(String[] args) {
		/* While1:Napisati program koji unosi i 
		 * sabira brojeve dokle god nije unesen negativan broj, 
		 * i ispisuje njihov zbir (zbir pozitivnih brojeva).primer: 
		 * ako korisnik unese 1 2 5 3 -1, 
		 *  program treba da ispise 11
		 */

         Scanner sc = new Scanner(System.in);
         System.out.println("Unesite broj");
         double x = sc.nextDouble();
         double y = 0;
         while (x>0) {
        	 y = x + y;
        	 System.out.println("zbir je " + y);
        	 x = sc.nextDouble();
        	
        	 
         } 
         System.out.println("Negativan broj");
         
         
         
}
}