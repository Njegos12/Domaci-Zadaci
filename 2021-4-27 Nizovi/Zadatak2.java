package Biblioteka;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		

       Scanner  sc = new Scanner(System.in);
       System.out.println("Uneti duzinu niza");
       
       int duzina=sc.nextInt();
       int niz[]=new int [duzina];
       
       
       for(int i = 0; i <duzina ; i++) {
    	   System.out.println("Unesite" + (i + 1) + ". element u niza");
    	   niz[i] = sc.nextInt();
       }
    	mnozenje(niz);
       int proizvod = mnozenje(niz);
       String prozvod;
	System.out.println("Proizvod elementa u nizu je " + proizvod);
		
	}

	public  static int mnozenje(int[] niz) {
		int proizvod = 1;
		
		for(int i = 0; i<niz.length; i++) {
			proizvod = proizvod * niz[i];
		
	}
		return proizvod;

		
	}

}
