package BackEndSettimana05Giorno02.GestionePrenotazioni.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import BackEndSettimana05Giorno02.GestionePrenotazioni.Entities.Utente;

@Service
public class UtenteService {
	private List<Utente> utenti = new ArrayList<>();

	public Utente save(Utente utente) {
		Random rndm = new Random();
		utente.setId(rndm.nextInt());
		this.utenti.add(utente);
		return utente;
	}

	public List<Utente> getUtenti() {
		return this.utenti;
	}

	public Optional<Utente> findById(int id) {
		Utente u = null;

		for (Utente utente : utenti) {
			if (utente.getId() == id)
				u = utente;
		}

		return Optional.ofNullable(u);
		// ritorno un Optional, quindi vuol dire che potrebbe essere o Utente o null
	}

	public void findByIdAndDelete(int id) {
		ListIterator<Utente> iterator = this.utenti.listIterator();

		while (iterator.hasNext()) {
			Utente currentUtente = iterator.next();
			if (currentUtente.getId() == id) {
				iterator.remove();
			}
		}
	}

	public Optional<Utente> findByIdAndUpdate(int id, Utente utente) {
		Utente found = null;

		for (Utente currentUtente : utenti) {
			if (currentUtente.getId() == id) {
				found = currentUtente;
				found.setNome(utente.getNome());
				found.setCognome(utente.getCognome());
				found.setId(id);
			}
		}
		return Optional.ofNullable(found);

	}
}
