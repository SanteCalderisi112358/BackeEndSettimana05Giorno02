package BackEndSettimana05Giorno02.GestionePrenotazioni.Entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Edificio {

	private int id;
	private String nome;
	private String indirizzo;
	private String citta;

	public Edificio(String nome, String indirizzo, String citta) {

		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
	}

	@Override
	public String toString() {
		return "Edificio [id=" + id + ", Nome=" + nome + ", Indirizzo=" + indirizzo + ", Città=" + citta + "]";
	}

}
