package App.Entities;

import java.util.HashMap;
import java.util.Map;

public class Catalogo {

    //Atributos - Contrutor
    public static Map<String, Midias> musicas = new HashMap<>();

    //Construtor
    public Catalogo() {
        this.musicas = new HashMap<>();

        // 🎸 ROCK
        musicas.put("Bohemian Rhapsody", new Midias("Bohemian Rhapsody", "Queen", "6:00", "Rock"));
        musicas.put("Smells Like Teen Spirit", new Midias("Smells Like Teen Spirit", "Nirvana", "5:01", "Rock"));

        // 🎤 POP
        musicas.put("Shape of You", new Midias("Shape of You", "Ed Sheeran", "4:24", "Pop"));
        musicas.put("Levitating", new Midias("Levitating", "Dua Lipa", "3:23", "Pop"));

        // 🎶 MPB
        musicas.put("Aquarela do Brasil", new Midias("Aquarela do Brasil", "João Gilberto", "4:12", "MPB"));
        musicas.put("Chega de Saudade", new Midias("Chega de Saudade", "Tom Jobim", "3:18", "MPB"));

        // 🎷 JAZZ
        musicas.put("So What", new Midias("So What", "Miles Davis", "9:22", "Jazz"));
        musicas.put("Take Five", new Midias("Take Five", "Dave Brubeck", "5:24", "Jazz"));

        // 🎼 CLÁSSICA
        musicas.put("Sinfonia nº 5", new Midias("Sinfonia nº 5", "Beethoven", "7:10", "Clássica"));
        musicas.put("Clair de Lune", new Midias("Clair de Lune", "Debussy", "5:12", "Clássica"));

        // 🪗 FORRÓ
        musicas.put("Asa Branca", new Midias("Asa Branca", "Luiz Gonzaga", "3:15", "Forró"));
        musicas.put("Esperando na Janela", new Midias("Esperando na Janela", "Gilberto Gil", "4:05", "Forró"));
    }

    //Metodos

    //Get - Sett
    public Map<String, Midias> getMusicas() {
        return musicas;
    }

    public void setMusicas(Map<String, Midias> musicas) {
        this.musicas = musicas;
    }
}
