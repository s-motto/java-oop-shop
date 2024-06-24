package org.lessons.java.shop;


//Usate opportunamente i livelli di accesso (public, private), i costruttori,
//i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
//alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
//il codice prodotto sia accessibile solo in lettura
//gli altri attributi siano accessibili sia in lettura che in scrittura
//il prodotto esponga un metodo per avere il prezzo base
//il prodotto esponga un metodo per avere il prezzo comprensivo di iva
//il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome



public class Prodotto {
	
	private double codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private int iva;
	
	
	public double getCodice() {
		return this.codice;
	}
	

	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getDescrizione() {
		return this.descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione=descrizione;
	}
	
	public float getPrezzo() {
		return this.prezzo;
	}
	
	public void setPrezzo(float prezzo) {
		this.prezzo=prezzo;
	}
	
	public int getIva() {
		return this.iva;
	}
	
	public void setIva(int iva) {
		this.iva=iva;
	}
	
	
	
	//numero random
	double codiceRandom() {
		return Math.floor(Math.random()* (9000- 1000 + 1) + 1000 );
	}
	
	//trasformo double in int per eliminare il .0 finale
	int codiceFinale=(int) codiceRandom();
	
	Prodotto(double codice, String nome, String descrizione, float prezzo, int iva){
		this.codice= codiceRandom();
		this.nome=nome;
		this.descrizione=descrizione;
		this.prezzo=prezzo;
		this.iva=iva;
				
	};
	
	//calcolo prezzo finale
	float prezzoPiuIva() {
 
		float percentuale=prezzo+((prezzo*iva)/100);
		return percentuale;
	}
	
	
	


    //stringa con le info del prodotto
    String infoProdotto(){
return "Codice "+codiceFinale+", "+nome+", "+descrizione+", "+ prezzo+"euro, iva al "+iva+"%"+". Prezzo finale: "+prezzoPiuIva();
};



}
