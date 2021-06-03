package paranbroj1;

import java.util.Scanner;

public class Kalenndar {

	public static void main(String[] args) {
		/*Grananja3: Napisati program koji na osnovu unetog naziva meseca ispisuje
		 *  koliko ima meseci u
		 *  godini koji pocinju na to slovo(na taj glas) 
		 * - za resavanje ovog zadatka koristiti switch
		 */
	    Scanner s = new Scanner(System.in);
	    System.out.println("Unestie zeljeni mesec");
		String mesec = s.next();
		
	     switch(mesec) {
        case "Januar" :
        System.out.println("tri meseca pocinju slovom J");
        break;
        case "Februar" :
        	System.out.println("jeddan mesec pocinje sa slovom f");
        break;
        case "Mart" :
        	System.out.println("dva meseseca poocinju slovom m");
        break;
        case "April" :
        System.out.println("dva meseca ppocinju slovom A");
        break;
        case "Maj" :
        System.out.println("jedan mesec pocinje slovom m");
        break;
        case "Juni" :
        System.out.println("tri meseca pocinju slovom J");
        break;
        case "Avgust": 
        System.out.println("dva meseca poocinju slovom a");
        break;
        case "Septembar" : 
        System.out.println("jedan mesec pocinje slvom s");
        break;
        case "Oktobar" :
        System.out.println("jedan mesec pocinje slvom o");
        break;
        case "Novembar":
        System.out.println("jedan mesec pocinje slovom n");
        break;
        case "Decembar" :
        System.out.println("jedan mmesec pocinje slvom d");
        break;
        	
        default : { System.out.println("ne postoji mesec sa tim pocetnim slovom");
        }
	}
	}
}
