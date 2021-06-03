package Biblioteka;

import java.util.Scanner;

public class ZbirBrojevaN {

	public static void main(String[] args) {
		/*Napisati program koji racuna zbir prvih n prirodnih brojeva,
		 *  izostavljajuci one koji su deljivi brojem k.
		 */


		Scanner sc = new Scanner(System.in);
		int sum =0 ;
		int i = 1;
		System.out.println("Do broja n");
		int n = sc.nextInt();
		
		
		System.out.println("Uneiste k");
		int k =  sc.nextInt();
		
		while (i <= n) {
			if (i % k == 0)
				sum=sum+ i;
			
			i++;
			
		}
		System.out.println("Suma je: " + sum);
	}
	

}
