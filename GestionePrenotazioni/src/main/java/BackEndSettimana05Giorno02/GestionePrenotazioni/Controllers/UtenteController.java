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

import BackEndSettimana05Giorno02.GestionePrenotazioni.Entities.Utente;
import BackEndSettimana05Giorno02.GestionePrenotazioni.Services.UtenteService;

@RestController
@RequestMapping("/utenti")
public class UtenteController {
	
	@Autowired
	UtenteService utenteSrv;

	@PostMapping("")
@ResponseStatus(HttpStatus.CREATED)
public Utente save(@RequestBody Utente utente) {
	utenteSrv.save(utente);
	System.err.println(utente.toString() + " salvato correttamente nel Web Server");
	return utente;
}

@GetMapping
public List<Utente> getAllUtenti() {
	return utenteSrv.getUtenti();
}
}
