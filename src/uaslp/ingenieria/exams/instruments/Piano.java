package uaslp.ingenieria.exams.instruments;

import uaslp.ingenieria.exams.InstrumentPlayer;
import uaslp.ingenieria.exams.Nota;

public class Piano implements InstrumentPlayer {

    public void presionaTecla(Nota nota){

    }
    public void playNote(Nota nota){
        presionaTecla(nota);
    }
}
