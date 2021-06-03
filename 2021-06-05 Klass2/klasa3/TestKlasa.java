package klasa3;

public class TestKlasa {

	public static void main(String[] args) {
	
		
		
		
		Zaposleni x1 = new Zaposleni("Milos" , " Markovic", "Stolar", 45000);
	    Zaposleni x2 = new Zaposleni("Marko" , " Majdov", "frizer", 34000);
	    Zaposleni x3 = new Zaposleni("Marija" , " Stojanovic", "sobarica", 80000);
	    
	    Zaposleni [] zaposleni1 = { x1,x2,x3};
	    
	    Firma f1 = new Firma("Sve i svasta", "Morki Lug", 25462,zaposleni1);
	    
	    Zaposleni x4 = new Zaposleni ("Danije" , "Davidovic", "vozac", 45300);
	    Zaposleni x5 = new Zaposleni("Milan" , " todorovic", "docent", 34200);
	    Zaposleni x6 = new Zaposleni("Teofil" , "Panic", "doktor", 80030);
	    
	    Zaposleni []  zaposleni2 = {x4, x5,x6};
	   
	    Firma f2 = new Firma("Topalovici", "Beograd" , 12345,zaposleni2 );
	     
	    System.out.println(x2.getPrezime());
	    
	    System.out.println((x3.getPrezime() + "_" + x3.getIme() + " :" + " " + x3.getPozicija()).toUpperCase() + " " +" (" + x3.getMesecnaPrimanja() + ")");
	    
	    System.out.println((x6.getPrezime() + "_" + x6.getIme() + " :" + " " + x6.getPozicija()).toUpperCase() + " " +" (" + x6.getMesecnaPrimanja() + ")");
	    
	    
	    
	    

	}

}
