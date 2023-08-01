package BackEndSettimana05Giorno02.GestionePrenotazioni.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import BackEndSettimana05Giorno02.GestionePrenotazioni.Entities.Postazione;

@Service
public class PostazioneService {
	private List<Postazione> postazioni = new ArrayList<>();

	public Postazione save(Postazione postazione) {
		Random rndm = new Random();
		postazione.setId(rndm.nextInt());
		this.postazioni.add(postazione);
		return postazione;
	}

	public List<Postazione> getAllPostazioni() {
		return this.postazioni;
	}

	public Optional<Postazione> findById(int id) {
		Postazione pos = null;

		for (Postazione postazione : postazioni) {
			if (postazione.getId() == id)
				pos = postazione;
		}

		return Optional.ofNullable(pos);
		// ritorno un Optional, quindi vuol dire che potrebbe essere o Utente o null
	}

	public void findByIdAndDelete(int id) {
		ListIterator<Postazione> iterator = this.postazioni.listIterator();

		while (iterator.hasNext()) {
			Postazione currentPostazione = iterator.next();
			if (currentPostazione.getId() == id) {
				iterator.remove();
			}
		}
	}

	public Optional<Postazione> findByIdAndUpdate(int id, Postazione postazione) {
		Postazione found = null;

		for (Postazione currentPostazione : postazioni) {
			if (currentPostazione.getId() == id) {
				found = currentPostazione;
				found.setEdificio(postazione.getEdificio());
				found.setLibera(postazione.isLibera());
				found.setTipoPostazione(postazione.getTipoPostazione());
				found.setId(id);
			}
		}
		return Optional.ofNullable(found);

	}
}
