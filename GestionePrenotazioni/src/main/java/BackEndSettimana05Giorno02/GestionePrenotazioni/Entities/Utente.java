package BackEndSettimana05Giorno02.GestionePrenotazioni.Entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Utente {

	private int id;
	private String nome;
	private String cognome;
	private String username;

	public Utente(String nome, String cognome, String username) {

		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", username=" + username + "]";
	}

}

