package Zadaci;

import java.util.Scanner;

public class For3java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj zvezdica");
		
		int zvezdice = sc.nextInt();
		
		for (int y = 1; y <=zvezdice; y++) {
			
			for(int u=zvezdice; u >=y; u--) {
				System.out.print("*");
				
			}
				System.out.println();
				
		}
				
	}

}
