package retribuzioni;

import java.util.ArrayList;

public class Calcolatrice {

	private static final String STR_AMMINISTRATORI	= "amministratori";
	private static final String STR_MANAGER			= "manager";
	private static final String STR_VENDITORI		= "venditori";
	private static final String STR_TECNICI			= "tecnici";
	private static final double RETE_VENDITORI		= 0.1;
	private static final double RETE_MANAGER		= 0.05;
	
	private ArrayList<Dipendenti> listaDipendenti = new ArrayList<Dipendenti>();
	
	public Calcolatrice(){
		listaDipendenti.add(new Amministratori("Maria", 1500.00, "TeamA"));
		listaDipendenti.add(new Manager("Mario", 1500.00, "TeamB"));
		listaDipendenti.add(new Venditori("Virna", 500.00, "TeamB", 15000.00));
		listaDipendenti.add(new Venditori("Vittorio", 500.00, "TeamA", 17000.00));
		listaDipendenti.add(new Tecnici("Teresa", 1400.00, "TeamB"));		
	}
	
	public double CalcolaStipendioTotaleAzienda(){
		double stipendio = 0.0;
		
		for (int i = 0; i < listaDipendenti.size(); i++){
			stipendio += CalcolaStipendio(listaDipendenti.get(i));
		}
		return stipendio;
	}
	
	public double CalcolaStipendioTotaleTecnici(){
		double stipendio = 0.0;
		String ruolo = "";
		
		for (int i = 0; i < listaDipendenti.size(); i++){
			
			ruolo = listaDipendenti.get(i).getRuolo();
			
			switch(ruolo) {
			case STR_AMMINISTRATORI:
				break;
			case STR_MANAGER:
				break;
			case STR_VENDITORI:
				break;
			case STR_TECNICI:
				stipendio += calcolaStipendioTecnici(listaDipendenti.get(i));
				break;
			default:
			}
		}

		return stipendio;		
	}
	
	public double CalcolaStipendioTotaleVenditori(){
		double stipendio = 0.0;
		String ruolo = "";
		
		for (int i = 0; i < listaDipendenti.size(); i++){
			
			ruolo = listaDipendenti.get(i).getRuolo();
			
			switch(ruolo) {
			case STR_AMMINISTRATORI:
				break;
			case STR_MANAGER:
				break;
			case STR_VENDITORI:
				stipendio += calcolaStipendioVenditori(listaDipendenti.get(i));
				break;
			case STR_TECNICI:
				break;
			default:
			}
		}

		return stipendio;		
	}

	public double CalcolaStipendioTotaleManager(){
		double stipendio = 0.0;
		String ruolo = "";
		
		for (int i = 0; i < listaDipendenti.size(); i++){
			
			ruolo = listaDipendenti.get(i).getRuolo();
			
			switch(ruolo) {
			case STR_AMMINISTRATORI:
				break;
			case STR_MANAGER:
				stipendio += calcolaStipendioManager(listaDipendenti.get(i));
				break;
			case STR_VENDITORI:
				break;
			case STR_TECNICI:
				break;
			default:
			}
		}

		return stipendio;		
	}
	
	public double CalcolaStipendioTotaleAmministratori(){
		double stipendio = 0.0;
		String ruolo = "";
		
		for (int i = 0; i < listaDipendenti.size(); i++){
			
			ruolo = listaDipendenti.get(i).getRuolo();
			
			switch(ruolo) {
			case STR_AMMINISTRATORI:
				stipendio += calcolaStipendioAmministratori(listaDipendenti.get(i));
				break;
			case STR_MANAGER:
				break;
			case STR_VENDITORI:
				break;
			case STR_TECNICI:
				break;
			default:
			}
		}

		return stipendio;		
	}

	private double CalcolaStipendio(Dipendenti dipendenti){
		double stipendio = 0.0;
		String ruolo = "";
		
		ruolo = dipendenti.getRuolo();
		
		switch(ruolo) {
		case STR_AMMINISTRATORI:
			stipendio = calcolaStipendioAmministratori(dipendenti);
			break;
		case STR_MANAGER:
			stipendio = calcolaStipendioManager(dipendenti);
			break;
		case STR_VENDITORI:
			stipendio = calcolaStipendioVenditori(dipendenti);
			break;
		case STR_TECNICI:
			stipendio = calcolaStipendioTecnici(dipendenti);
			break;
		default:
		}
		return stipendio;
	}
	
	private double calcolaStipendioTecnici(Dipendenti dipendenti) {
		double rtnValue = 0.0;
		
		rtnValue = dipendenti.getStipendioBase();
		
		return rtnValue;
	}


	private double calcolaStipendioVenditori(Dipendenti dipendenti) {
		double rtnValue = 0.0;
		Venditori venditori = (Venditori) dipendenti;
		
		rtnValue = venditori.getStipendioBase() + (venditori.getVenduto()*RETE_VENDITORI);
		
		return rtnValue;
	}


	private double calcolaStipendioManager(Dipendenti dipendenti) {
		double rtnValue = 0.0;
		
		rtnValue = dipendenti.getStipendioBase();

		for(int i = 0; i < listaDipendenti.size(); i++){
			if(listaDipendenti.get(i).equals(dipendenti))
				continue;
			switch(listaDipendenti.get(i).getRuolo()){
			case STR_AMMINISTRATORI:
				break;
			case STR_MANAGER:
				break;
			case STR_VENDITORI:
				if( listaDipendenti.get(i).getTeam().equals(dipendenti.getTeam()) )
					rtnValue += calcolaStipendioVenditori(listaDipendenti.get(i)) * RETE_MANAGER;
				break;	
			case STR_TECNICI:
				if( listaDipendenti.get(i).getTeam().equals(dipendenti.getTeam()) )
					rtnValue += calcolaStipendioTecnici(listaDipendenti.get(i)) * RETE_MANAGER;
				break;
			default:
			}
		}
		return rtnValue;
	}


	private double calcolaStipendioAmministratori(Dipendenti dipendenti) {
		double rtnValue = 0.0;
		
		rtnValue = dipendenti.getStipendioBase();

		for(int i = 0; i < listaDipendenti.size(); i++){
			if(listaDipendenti.get(i).equals(dipendenti))
				continue;
			switch(listaDipendenti.get(i).getRuolo()){
			case STR_AMMINISTRATORI:
				break;
			case STR_MANAGER:
				rtnValue += calcolaStipendioManager(listaDipendenti.get(i)) * RETE_MANAGER;
				break;
			case STR_VENDITORI:
				rtnValue += calcolaStipendioVenditori(listaDipendenti.get(i)) * RETE_MANAGER;
				break;	
			case STR_TECNICI:
				rtnValue += calcolaStipendioTecnici(listaDipendenti.get(i)) * RETE_MANAGER;
				break;
			default:
			}
		}
		
		return rtnValue;
	}
}
