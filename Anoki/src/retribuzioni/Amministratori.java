package retribuzioni;

public class Amministratori extends Dipendenti{

	private static final String RUOLO = "amministratori";

	public Amministratori(String nome, double stipendioBase, String team) {
		super(nome, RUOLO, stipendioBase, team);
	}

}
