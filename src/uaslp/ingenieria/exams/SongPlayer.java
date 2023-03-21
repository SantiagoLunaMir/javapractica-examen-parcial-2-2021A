package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SongPlayer {
    /*
    private Piano piano = new Piano();
    private Guitarra guitarra = new Guitarra();
    private Violin violin = new Violin();
    private Flauta flauta = new Flauta();
    private Cello cello = new Cello();
    */
    //tomar en cuenta las responsabilidades de cada clase, metodo,etc
    //una clase y una unica responsabilidad, que serian de alta cohesion y bajo acoplamiento
    //Baja cohesion es muchas responsabilidades para un metodos, que tanto tienen que ver los metodos dentro de una clase
    public void play(Song song, InstrumentPlayer instrumentPlayer) {//inyeccion de dependencias, debido a que depende del instrumento y se le pasa por parametro,funciona con interfaces
        Iterator<Nota> notas = song.getSongIterator();
        //InstrumentPlayer instrumentPlayer= instrumento.getInstrumentPlayer();
        while (notas.hasNext()) {
            Nota nota = notas.next();
            instrumentPlayer.playNote(nota);
        }

    }
    /*public InstrumentPlayer getinstrumentPlayer(Instrumento instrumento){
        return switch (instrumento) {//factory patron que indica que se basa en un solo parametro donde se genera un objeto //el switch permite reurn
            case PIANO ->piano;
            case FLAUTA -> flauta;
            case VIOLIN -> violin;
            case GUITARRA -> guitarra;
            case CELLO -> cello;
        };
    }*/

}
