package paranbroj1;

import java.util.Scanner;

public class Granjanja2 {

	public static void main(String[] args) {
		/* Grananja2: Prvi domaci zadatak od 15.4.2021. uraditi ponovo,
		 *  koristeci grananja kako bismo se ogradili od nemogucih izracunavanja povrsina 
		 *  (kakvi celi brojevi moraju da budu visina, sirina i duzina?)Grananja2:
		 * Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije, 
		 * tako sto se ivice prostorije ucitavaju preko konzole.
		 *  (za pretpostavku uzeti da prostorija ima 
		 * zidove oblika pravougaonika i da nema prozora i vrata). 
		 */

		Scanner s = new Scanner(System.in);
		
		System.out.println("Duzina stranice je");
		int a = s.nextInt();
		if (a<=0) { System.out.println("Uneli ste neispravnu duzinu!");
		}
		System.out.println("Visina stranice je");
		int v = s.nextInt();
	    if (v<=0) { System.out.println("Uneli ste neispravnu visinu!");
		}
		System.out.println("Sirina stranice je");
		int k = s.nextInt();
		if (k<=0) { System.out.println("uneli ste nesipravnu sirinu!");
		}
		else {
		System.out.println("Povrsina prostorije je:" + 2*(a+k)*v+(a*k)) ;
		}
		
	
		
	}
	}

