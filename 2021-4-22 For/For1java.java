package Zadaci;

import java.util.Scanner;

public class For1java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite rec");
		String Y = "ZLATIBOR";
		
		while (!Y.equals("Stop"))
		{
			Y=sc.nextLine();
			Y=Y.toLowerCase();
		}
		System.out.println("Program stopiran");
		}
	}


