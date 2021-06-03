package testttt;

import java.util.Scanner;

public class Funkcije1 {

	public static void main(String[] args) {
		/*Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
		 * (znaci da korisnik unosi tri broja) i taj program treba da pozove i ispise (u mainu) 
		 * najmanji od ta tri unesena broja.
		 */
          
		Scanner sc = new Scanner(System.in);
        System.out.println("Unsite prvi broj");
        int prvBroj=sc.nextInt();
        
        System.out.println("Unesite drugi broj");
        int drugiBroj=sc.nextInt();
        
        System.out.println("Unesite treci broj");
        int treciBroj=sc.nextInt();
        
        
        System.out.println("Najmanji broj vaseg unosa je " + ispis(prvBroj,drugiBroj,treciBroj));
  }
    public static int ispis(int a,int b , int c) {
	if (a<b) {
		return a;
	} if (b<c) {
		return b;
	} if (c<a)
		return c;
	{ if (b<a)
		return b;
	}
	return c;

    }
}	
    
