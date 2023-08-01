package BackEndSettimana05Giorno02.GestionePrenotazioni.Entities;

public class Utente {

	private int id;
	private String nome;
	private String cognome;
	private String username;
	private String email;

	public Utente(String nome, String cognome, String username, String email) {

		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", username=" + username + "]";
	}

}

