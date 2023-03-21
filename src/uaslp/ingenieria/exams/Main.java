package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
//estructura que sirve para mapear clave a valor: mapa, diccionario, hashtable.
    //tabla hash

    public static void main(String[] args) {
        List<String> listadeStrings;
        Map<Instrumento,InstrumentPlayer>/*clave,valor*/ instrumentos=new HashMap<>();//TreeMap<>(); //Complejidad de treemap Big O Notation O(lgn),de hashmap Big O Notation N, por decir un ejemplo de ambos
        instrumentos.put(Instrumento.CELLO,new Cello());
        instrumentos.put(Instrumento.PIANO,new Piano());
        instrumentos.put(Instrumento.BASS,new Bass());
        instrumentos.put(Instrumento.FLAUTA,new Flauta());
        instrumentos.put(Instrumento.GUITARRA,new Guitarra());
        instrumentos.put(Instrumento.VIOLIN,new Violin());
        String fileName = "archivo.music"; //args[0];
        Instrumento instrumento = Instrumento.valueOf("PIANO");  //args[1]

        SongPlayer songPlayer = new SongPlayer();
        Song song = new Song(new File(fileName));

        songPlayer.play(song, instrumento.getInstrumentPlayer());//el get itera en toda la lista (suponinedo que es una lista) pero sin recorrer todo

    }
}
