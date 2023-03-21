package uaslp.ingenieria.exams.instruments;

import uaslp.ingenieria.exams.InstrumentPlayer;
import uaslp.ingenieria.exams.Nota;

public class Flauta implements InstrumentPlayer {
    public void sopla(Nota nota) {

    }
    public void playNote(Nota nota){
        sopla(nota);
    }
}
