package retribuzioni;

import java.util.ArrayList;

public class DemoClass {
	
	public static void main(String[] args) {
		ArrayList<Dipendenti> listaDipendenti = new ArrayList<Dipendenti>();
		
		Calcolatrice calcola = new Calcolatrice();
		
		System.out.println("Stipendio totale:" + calcola.CalcolaStipendioTotaleAzienda());
	}

}
