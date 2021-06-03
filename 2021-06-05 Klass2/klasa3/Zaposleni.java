package klasa3;

public class Zaposleni {
	
	
	
	private String Ime;
	private String Prezime;
	private String Pozicija;
	private int mesecnaPrimanja;
	
	public Zaposleni(String ime, String prezime, String pozicija, int mesecnaPrimanja) {
		super();
		Ime = ime;
		Prezime = prezime;
		Pozicija = pozicija;
		this.mesecnaPrimanja = mesecnaPrimanja;
	}

	public String getIme() {
		return Ime;
	}

	public void setIme(String ime) {
		Ime = ime;
	}

	public String getPrezime() {
		return Prezime;
	}

	public void setPrezime(String prezime) {
		Prezime = prezime;
	}

	public String getPozicija() {
		return Pozicija;
	}

	public void setPozicija(String pozicija) {
		Pozicija = pozicija;
	}

	public int getMesecnaPrimanja() {
		return mesecnaPrimanja;
	}

	public void setMesecnaPrimanja(int mesecnaPrimanja) {
		this.mesecnaPrimanja = mesecnaPrimanja;
	}
	
	
	

}
