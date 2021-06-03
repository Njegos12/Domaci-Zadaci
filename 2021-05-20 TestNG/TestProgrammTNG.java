package tng;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestProgrammTNG {

	 
		
		
		@Test
		public void testRacunajKrug () {
			Calc c1 = new Calc ();
			Double rez = c1.pKruga(2);
			Assert.assertEquals(rez, 12.56);
		}	
		
		@Test
		public void testRacunajKvadrat () {
			Calc c1 = new Calc ();
			Double rez = c1.pKvadrata(3);
			Assert.assertEquals(rez, 3);	
		}
		
	 @BeforeMethod 
	 public void  Njegos()
	 { System.out.println("Pocetak testa");
		 
	 }
	 
	 
		@Test
		public void testRacunajPravougaonik () {
			Calc c1 = new Calc ();
			Double rez = c1.pPravougaonika(2, 3);
			Assert.assertEquals(rez, 6.0);	
			
		}

	}


