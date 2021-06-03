package Zadaci;

import java.util.Scanner;

public class Vezbanje1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Unesite zeljenu opciju");
		 int mogucnost = 0;
		 mogucnost = sc.nextInt();
		 
		 int proizvodCena = 0;
		 int racun=0;
		 
		 int novac=0;
		 int povracaj=0;
		 
		 switch(mogucnost) {
		 case 0 :
			 System.out.println("Kraj programa");
			 break;
		 case 1:
			 System.out.println("Unesite cenu proizvoda");
			 proizvodCena=sc.nextInt();
			 racun = proizvodCena + racun;
			 
			 System.err.println("Iznoos vaseg  racuna je " + racun);
			 
			 break;
		 case 2:
			 System.out.println("Unesite raspolozivu svotu novca");
			 novac = sc.nextInt();
			 System.out.println("Unesite cenu  proizvoda");
			 proizvodCena=sc.nextInt();
			 if(novac-proizvodCena<racun) {
				 novac = proizvodCena;
				 
				 System.out.println("Error");
			 }
			if (novac-proizvodCena>=racun) {
				racun=novac-proizvodCena;
				System.out.println("Povracaj novca" + racun);
				racun=0;
			}
			default :
				
				System.out.println("Meni");
				System.out.println("0. zatvaranje kase");
				System.out.println("1.potrosacka korpa");
				System.out.println("Iznos vaseg racuna");
			}
		 }
		 
		 
		
		
	}


