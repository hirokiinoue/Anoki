package retribuzioni;

public abstract class Dipendenti {

	private String nome;
	private String ruolo;
	private double stipendioBase;
	private String team;
	
	public Dipendenti(String nome, String ruolo, double stipendioBase, String team){
		this.nome = nome;
		this.ruolo = ruolo;
		this.stipendioBase = stipendioBase;
		this.team = team;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public double getStipendioBase() {
		return stipendioBase;
	}

	public void setStipendioBase(double stipendioBase) {
		this.stipendioBase = stipendioBase;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
