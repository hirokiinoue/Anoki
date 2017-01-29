package retribuzioni;

import static constants.BaseSalaryConstants.*;

public class Tecnici extends Dipendenti{

	public Tecnici(String nome) {
		super(nome, BASESALARY_TECNICI);
	}

	public double getSalary() {
		return super.getSalary();
	}
}
