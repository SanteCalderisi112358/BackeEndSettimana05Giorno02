package BackEndSettimana05Giorno02.GestionePrenotazioni.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import BackEndSettimana05Giorno02.GestionePrenotazioni.Entities.Edificio;

@Service
public class EdificioService {
	private List<Edificio> edifici = new ArrayList<>();

	public Edificio save(Edificio edificio) {
		Random rndm = new Random();
		edificio.setId(rndm.nextInt());
		this.edifici.add(edificio);
		return edificio;
	}

	public List<Edificio> getAllEdifici() {
		return this.edifici;
	}

	public Optional<Edificio> findById(int id) {
		Edificio ed = null;

		for (Edificio edificio : edifici) {
			if (edificio.getId() == id)
				ed = edificio;
		}

		return Optional.ofNullable(ed);
		// ritorno un Optional, quindi vuol dire che potrebbe essere o Utente o null
	}

	public void findByIdAndDelete(int id) {
		ListIterator<Edificio> iterator = this.edifici.listIterator();

		while (iterator.hasNext()) {
			Edificio currentEdificio = iterator.next();
			if (currentEdificio.getId() == id) {
				iterator.remove();
			}
		}
	}

	public Optional<Edificio> findByIdAndUpdate(int id, Edificio edificio) {
		Edificio found = null;

		for (Edificio currentEdificio : edifici) {
			if (currentEdificio.getId() == id) {
				found = currentEdificio;
				found.setNome(edificio.getNome());
				found.setCitta(edificio.getCitta());
				found.setIndirizzo(edificio.getIndirizzo());
				found.setId(id);
			}
		}
		return Optional.ofNullable(found);

	}
}
