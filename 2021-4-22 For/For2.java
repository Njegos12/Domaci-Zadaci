package Zadaci;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		
		 Scanner sc = new Scanner(System.in);
		 
		 int x = 1;
		 int zbir = 0;
		 System.out.println("Broj n");
		 
		 int n = sc.nextInt();
		 
		 while(x < n) {
			 if (x % 5 != 0) {
				 zbir = zbir + x;
		 }
		  if (x==13) {
			 break; 
			 }
           x++;	
		 }
           System.out.println(zbir);
	}
}
