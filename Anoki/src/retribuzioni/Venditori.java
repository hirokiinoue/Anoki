package retribuzioni;

public class Venditori extends Dipendenti{

	private double venduto;
	private static final String RUOLO = "venditori";
	
	public Venditori(String nome, double stipendioBase, String team, double venduto) {
		super(nome, RUOLO, stipendioBase, team);
		this.venduto = venduto;
	}

	public double getVenduto() {
		return venduto;
	}

	public void setVenduto(double venduto) {
		this.venduto = venduto;
	}
}
