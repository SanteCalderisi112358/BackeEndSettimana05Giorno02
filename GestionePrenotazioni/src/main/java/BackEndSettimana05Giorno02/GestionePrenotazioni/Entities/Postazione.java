package BackEndSettimana05Giorno02.GestionePrenotazioni.Entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

	public class Postazione {
		
		private int id;
		private TipoPostazione tipoPostazione;
		private boolean libera;

		private Edificio edificio;

		public Postazione(TipoPostazione tipoPostazione,boolean libera,
				Edificio edificio) {

			this.tipoPostazione = tipoPostazione;
			this.libera = libera;
			this.edificio = edificio;
		}

		@Override
		public String toString() {
			String disponibilita = libera ? "LIBERA" : "OCCUPATA";
			return "Postazione [id=" + id + ", Tipo Postazione=" + tipoPostazione + ", " + edificio + ", Disponibilità="
					+ disponibilita + "]";
		}

}
