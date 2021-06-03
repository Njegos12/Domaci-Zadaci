package testttt;

import java.util.Scanner;

public class Funkcije2 {

	public static void main(String[] args) {
		/*Funkcije2: Napisati program koji ce procitati
		 *  3 cela broja sa standardnog ulaza i taj program treba da pozove i vrati
		 *   (u mainu) proizvod unetih brojeva.
		 */
         Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi  broj");
		double prviBroj = sc.nextDouble();
		
		System.out.println("Unesite drugi broj");
		double drugiBroj = sc.nextDouble();
		
		System.out.println("Unesite treci broj");
		double treciBroj = sc.nextDouble();
	
		System.out.println("Prozvod brojeva je : " + proizvod(prviBroj,drugiBroj,treciBroj));
	
	    
	}	

	

	public static double proizvod(double a, double b,double c) {
	      double h = a * b * c;
			return h;
	}
	
}
