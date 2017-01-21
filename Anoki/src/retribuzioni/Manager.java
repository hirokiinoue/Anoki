package retribuzioni;

public class Manager extends Dipendenti{

	private static final String RUOLO = "manager";

	public Manager(String nome, double stipendioBase, String team) {
		super(nome, RUOLO, stipendioBase, team);
	}
}
