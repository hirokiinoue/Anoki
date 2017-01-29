package retribuzioni;

public abstract class Dipendenti {

	private String nome = "";
	private double stipendioBase = 0.0;
	
	public Dipendenti(String nome, double stipendioBase){
		this.nome = nome;
		this.stipendioBase = stipendioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getStipendioBase() {
		return stipendioBase;
	}

	public void setStipendioBase(double stipendioBase) {
		this.stipendioBase = stipendioBase;
	}

	public double getSalary() {
		
		return stipendioBase;
	}
}
