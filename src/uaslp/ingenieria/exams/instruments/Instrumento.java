package uaslp.ingenieria.exams.instruments;

import uaslp.ingenieria.exams.InstrumentPlayer;

public enum Instrumento {//puede tener atributos asi como metodos
    PIANO(new Piano()),//original: PIANO
    GUITARRA(new Guitarra()),
    FLAUTA(new Flauta()),
    VIOLIN(new Violin()),
    CELLO(new Cello()),
    BASS(new Bass());
    private InstrumentPlayer instrumentPlayer;
    Instrumento(InstrumentPlayer instrumentPlayer){
        this.instrumentPlayer=instrumentPlayer;
    }
    public InstrumentPlayer getInstrumentPlayer(){
        return instrumentPlayer;
    }
}
