package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lista prodotti
				Prodotto pasta= new Prodotto(0000, "Mezze penne Barilla", "Mezze penne rigate, da grano italiano", 2.45f, 20);
				Prodotto uova= new Prodotto(0000, "Uova Esselunga, 6pz", "uova da galline allevate a terra", 3.99f, 10);
				Prodotto salsaChilli= new Prodotto(0000, "Sweet Chilli Sauce Go-Tan", "salsa di peperoncino chili dolce", 4.34f,22);		
				
				
				System.out.println(pasta.infoProdotto());
				System.out.println(uova.infoProdotto());
				System.out.println(salsaChilli.infoProdotto());
	}

}
