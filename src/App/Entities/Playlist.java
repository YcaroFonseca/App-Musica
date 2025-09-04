package App.Entities;
import java.util.ArrayList;

public class Playlist extends Usuario {

    //Atributos
    private ArrayList<Midias> musicas;

    //Construtor
    public Playlist(String nome, String senha, String playlist) {
        super(nome, "", senha, playlist);
        this.musicas = new ArrayList<>();
    }

    //Get - Sett
    public ArrayList<Midias> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Midias> musicas) {
        this.musicas = musicas;
    }
}
