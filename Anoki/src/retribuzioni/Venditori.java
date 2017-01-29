package retribuzioni;

import static constants.BaseSalaryConstants.*;
import static constants.RateSalaryConstants.*;

public class Venditori extends Dipendenti{

	private double venduto;
	
	public Venditori(String nome, double venduto) {
		super(nome, BASESALARY_VENDITORI);
		this.venduto = venduto;
	}

	public double getVenduto() {
		return venduto;
	}

	public void setVenduto(double venduto) {
		this.venduto = venduto;
	}
	
	public double getSalary() {
		double rtnValue = 0.0;
		
		rtnValue = super.getSalary() + (this.getVenduto()*RATESALARY_TECNICI);
		
		return rtnValue;
	}
}