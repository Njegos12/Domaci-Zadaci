package putovanje1;

import java.util.ArrayList;
import java.util.List;

public class TestKlasa {

	public static void main(String[] args) {
		
		
		Putnici Sediste1 = new Putnici("Milan" ,"Milanovic",33423);
		Putnici Sediste2 = new Putnici("Marko", "Markovic" ,33223);
		
		List<Putnici> putnik1 = new ArrayList<Putnici>();
		
		putnik1.add(Sediste1);
		putnik1.add(Sediste2);
		
	
		Putovanje x1 = new Putovanje ("Spanija" ,2000 ,putnik1);
		
		Putovanje x2 = new Putovanje ("Nemacka" ,800 ,null);
		
		Putovanje x3 = new Putovanje  ("Italija", 2222, putnik1);
		
		
		List <Putovanje> ponuda = new ArrayList<Putovanje>();
		
		ponuda.add(x1);
		ponuda.add(x2);
		ponuda.add(x3);
		
		
		System.out.println(x3.getCenaAranzmana());
		
		x3.setCenaAranzmana(888);
		System.out.println(x3.getCenaAranzmana());
		
		System.out.println(ponuda.size());
		 
		
		 ponuda.remove(2);
		
		System.out.println(ponuda.size());
		
        System.out.println(x1.getListaPutnika().size());
        
        x1.getListaPutnika().remove(1);
		
        System.out.println(x1.getListaPutnika().size());
	}

}
