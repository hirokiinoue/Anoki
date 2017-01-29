package retribuzioni;

import java.util.ArrayList;

public class Calcolatrice {

	private ArrayList<Dipendenti> dipendenti = new ArrayList<Dipendenti>();
	
	public Calcolatrice(ArrayList<Dipendenti> dipendenti) {
		this.dipendenti = dipendenti;
	}
	
	public double CalcolaStipendioTotaleAzienda(){
			
		double rtnValue = 0.0;
		
		for (int i = 0; i < dipendenti.size(); i++){
			rtnValue += dipendenti.get(i).getSalary();
		}
		
		return rtnValue;
	}
	
	public double CalcolaStipendioIndividuale(String nome){
		
		double rtnValue = 0.0;
		
		for (int i = 0; i < dipendenti.size(); i++){
			if(dipendenti.get(i).getNome().equalsIgnoreCase(nome))
				rtnValue = dipendenti.get(i).getSalary();
		}
		
		return rtnValue;
	}
}
