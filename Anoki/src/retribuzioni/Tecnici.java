package retribuzioni;

public class Tecnici extends Dipendenti{

	private static final String RUOLO = "tecnici";
	
	public Tecnici(String nome, double stipendioBase, String team) {
		super(nome, RUOLO, stipendioBase, team);
	}
}
