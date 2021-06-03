package DomaciZadatak20_04_2021;

import java.util.Scanner;

public class DomaciZadatakPera {

	public static void main(String[] args) {
		/*
		 DoWhile1: Napisati program koji ce omoguciti
		  Peri da unese sa koliko novca raspolaze. 
		  On moze da kupuje sve dok mu ne ostane samo 89 dinara jer mu toliko novca 
		  treba da kupi BUSPLUS kartu i vrati se kuci sa novogodisnjim poklonima.
		   Pera treba  da unosi pojedinacne cene poklona, a
		    program treba da ga obavesti kada potrosi sav predvidjeni novac,
		    to jest kada za sledeci poklon vise nema kinte.
		     */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unestie raspoloziv novac");
		double novac = sc.nextDouble();
		double cenaPoklona=0;
		do {
			System.out.println("Unesite cenu poklona");
			cenaPoklona = sc.nextDouble();
			novac = novac - cenaPoklona;
		} while (novac >= 89);
		
		System.out.println("Nemate dovoljno novca za poklon");
	}

   }
	


