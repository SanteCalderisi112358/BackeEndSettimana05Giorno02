package BackEndSettimana05Giorno02.GestionePrenotazioni;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.javafaker.Faker;

import BackEndSettimana05Giorno02.GestionePrenotazioni.Controllers.UtenteController;
import BackEndSettimana05Giorno02.GestionePrenotazioni.Entities.Utente;

@SpringBootApplication
public class GestionePrenotazioniApplication {
	@Autowired
	private static UtenteController utenteCtrl;
	public static void main(String[] args) {
		SpringApplication.run(GestionePrenotazioniApplication.class, args);

		Faker faker = new Faker(Locale.ITALIAN);
		for (int i = 0; i < 10; i++) {
			Utente utente = new Utente(faker.name().firstName(), faker.name().lastName(),
					faker.lordOfTheRings().character());
			utenteCtrl.save(utente);

		}
	}

}
