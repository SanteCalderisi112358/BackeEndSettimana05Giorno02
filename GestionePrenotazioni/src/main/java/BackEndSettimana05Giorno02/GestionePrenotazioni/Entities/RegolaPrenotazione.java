package BackEndSettimana05Giorno02.GestionePrenotazioni.Entities;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegolaPrenotazione {
	@GetMapping("/regole")
	public String regole(@RequestParam String lingua) {
		String regolaIT = "Un utente può prenotare solamente una postazione libera. Ad ogni utente non sarà concesso di prenotare più di una postazione nello stesso giorno";
		String regolaEN = "A user can only reserve one available workstation. Each user will not be allowed to reserve more than one workstation on the same day.";
		if (lingua.equals("Italiano")) {
			return regolaIT;
		} else if (lingua.equals("English")) {
			return regolaEN;
		} else {
			return "La lingua selezionata non è gestita dal nostro Web Server";
		}
	}
}
