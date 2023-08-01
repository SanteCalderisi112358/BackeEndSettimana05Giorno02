package BackEndSettimana05Giorno02.GestionePrenotazioni.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import BackEndSettimana05Giorno02.GestionePrenotazioni.Entities.Postazione;
import BackEndSettimana05Giorno02.GestionePrenotazioni.Services.PostazioneService;

@RestController
@RequestMapping("/postazioni")
public class PostazioneController {
	@Autowired
	PostazioneService postazioneSrv;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Postazione savePostazione(@RequestBody Postazione postazione) {
		Postazione createPostazione = postazioneSrv.save(postazione);
		return createPostazione;
	}

	@GetMapping
	public List<Postazione> getPostazioni() {
		return postazioneSrv.getAllPostazioni();
	}
}
