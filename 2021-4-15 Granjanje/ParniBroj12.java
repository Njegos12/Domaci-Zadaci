package paranbroj1;

import java.util.Scanner;

public class ParniBroj12 {

	public static void main(String[] args) {

		/* Grananja1: Napisati program koji proverava da li je uneti broj paran.
		Ukoliko jeste, program treba da ispise poruku: Broj je paran! Ukoliko nije, 
		program treba da ispise poruku: 
			Broj je neparan
			*/

	Scanner sc = new Scanner(System.in);
	System.out.println("Unesite broj");
	int parnibroj = sc.nextInt();
	if (parnibroj % 2 == 0) {
		System.out.println("broj je paran ");
	}
	else {
		System.out.println("Broj je neparan!");
	}
}
}	
	