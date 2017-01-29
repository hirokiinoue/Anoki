package retribuzioni;

import java.util.ArrayList;

public class DemoClass {

	private ArrayList<Dipendenti> listDipendenti = new ArrayList<Dipendenti>();

	public DemoClass() {

		Manager managerA   = new Manager("Maria");
		Manager managerB   = new Manager("Mario");
		Venditori venditoriA = new Venditori("Virna",15000.00);
		Venditori venditoriB = new Venditori("Vittorio",17000.00);
		Tecnici tecniciA   = new Tecnici("Teresa");
		
		managerA.addSottoposti(managerB);
		managerA.addSottoposti(venditoriB);
		
		managerB.addSottoposti(venditoriA);
		managerB.addSottoposti(tecniciA);
		
		listDipendenti.add(managerA);
		listDipendenti.add(managerB);
		listDipendenti.add(venditoriA);
		listDipendenti.add(venditoriB);
		listDipendenti.add(tecniciA);
	}
	
	public static void main(String[] args) {

		DemoClass democlass = new DemoClass();
		Calcolatrice calcolatrice = new Calcolatrice(democlass.listDipendenti);
		
		System.out.println("Stipendio aziendale totale: " + calcolatrice.CalcolaStipendioTotaleAzienda());
		System.out.println("lo stipendio di Maria: " + calcolatrice.CalcolaStipendioIndividuale("Maria"));
		System.out.println("lo stipendio di Mario: " + calcolatrice.CalcolaStipendioIndividuale("Mario"));
		System.out.println("lo stipendio di Virna: " + calcolatrice.CalcolaStipendioIndividuale("Virna"));
		System.out.println("lo stipendio di Vittorio: " + calcolatrice.CalcolaStipendioIndividuale("Vittorio"));
		System.out.println("lo stipendio di Teresa: " + calcolatrice.CalcolaStipendioIndividuale("Teresa"));
	}

}
