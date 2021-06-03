package klasa3;

public class Firma {

	/*
	 * Firma poseduje naziv, sediste, PIB i niz zaposlenih. Sva polja mogu da se
	 * dohvate, a naziv firme moze i da se postavi.Ispisati ceo objekat klase
	 * firma.Ispisati prezimena svih zaposlenih u firmi.
	 * 
	 * Zaposleni ima ime i prezime koji se zadaju prilikom kreiranja, poziciju i
	 * iznos mesecnih primanja. Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA
	 * (mesecna zarada)
	 * 
	 * Napisati glavni program, gde cete testirati kako ove klase funkcionisu.
	 * 
	 * 
	 */

	private String Naziv;
	private String Sediste;
	private int pib;

	Zaposleni[] zaposleni;

	public Firma(String naziv, String sediste, int pib, Zaposleni[] zaposleni) {
		Naziv = naziv;
		Sediste = sediste;
		pib = pib;
		this.zaposleni = zaposleni;
	}

	public String getNaziv() {
		return Naziv;
	}

	public void setNaziv(String naziv) {
		Naziv = naziv;
	}

	public String getSediste() {
		return Sediste;
	}

	public int getPib() {
		return pib;
	}

	public Zaposleni[] getZaposleni() {
		return zaposleni;
	}

}
