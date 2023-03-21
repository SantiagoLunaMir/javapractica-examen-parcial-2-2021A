package uaslp.ingenieria.exams.instruments;

import uaslp.ingenieria.exams.InstrumentPlayer;
import uaslp.ingenieria.exams.Nota;

public class Violin implements InstrumentPlayer {
    public void toca(Nota nota) {

    }
    public void playNote(Nota nota){
        toca(nota);
    }
}
