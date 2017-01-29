package retribuzioni;

import static constants.BaseSalaryConstants.*;
import static constants.RateSalaryConstants.*;

import java.util.ArrayList;

public class Manager extends Dipendenti{

	private ArrayList<Dipendenti> listSottoposti = new ArrayList<Dipendenti>();

	public Manager(String nome) {
		super(nome, BASESALARY_MANAGER);
	}

	public ArrayList<Dipendenti> getListSottoposti() {
		return listSottoposti;
	}

	public void setListSottoposti(ArrayList<Dipendenti> listSottoposti) {
		this.listSottoposti = listSottoposti;
	}

	public void addSottoposti(Dipendenti dipendenti) {
		this.listSottoposti.add(dipendenti);
	}

	public double getSalary() {
		double rtnValue = 0.0;
		
		rtnValue = super.getSalary();
		for (int i = 0; i < listSottoposti.size(); i++) {
			rtnValue += listSottoposti.get(i).getSalary()*RATESALARY_MANAGER;
		}
		
		return rtnValue;
	}
}
