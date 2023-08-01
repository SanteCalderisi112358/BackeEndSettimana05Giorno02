package BackEndSettimana05Giorno02.GestionePrenotazioni.Entities;

import java.time.LocalDate;

public class Prenotazione {

	private int id;
	private LocalDate dataInizioPrenotazione;
	private LocalDate dataFinePrenotazione;

	private Utente utente;

	private Postazione postazione;

	public Prenotazione(LocalDate dataInizioPrenotazione, Utente utente, Postazione postazione) {

		this.dataInizioPrenotazione = dataInizioPrenotazione;
		this.dataFinePrenotazione = dataInizioPrenotazione.plusDays(1);
		this.utente = utente;
		this.postazione = postazione;
	}

	@Override
	public String toString() {
		return "Prenotazione [id=" + id + ", Data Inizio Prenotazione=" + dataInizioPrenotazione
				+ ", Data Fine Prenotazione=" + dataFinePrenotazione + ", " + utente + ", " + postazione + "]";
	}

}
