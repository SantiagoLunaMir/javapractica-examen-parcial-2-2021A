package uaslp.ingenieria.exams.instruments;

import uaslp.ingenieria.exams.InstrumentPlayer;
import uaslp.ingenieria.exams.Nota;
public class Cello implements InstrumentPlayer {
    public void tocaCuerda(Nota nota){

    }
    public void playNote(Nota nota){
        tocaCuerda(nota);
    }
}
