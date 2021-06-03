package DomaciZadatak20_04_2021;

import java.util.Scanner;

public class DomaciZadatakWhile2 {

	public static void main(String[] args) {
		/* While2: Napisati program koji ce na standardnom izlazu ispisati poruku
		 *  “Laku noc!” onoliko puta koliko je korisnik zadao preko konzole.
Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta  
		 */
         
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesti broj");
		int x = sc.nextInt();
		int brojcanik = 0;
		while (brojcanik < x) {
			System.out.println("Laku noc");
			brojcanik++;
		}
		
	}

}
