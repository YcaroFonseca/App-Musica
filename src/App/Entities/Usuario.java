package App.Entities;

public class Usuario {

    //Atributos
    private String nome;
    private String email;
    private String senha;
    private String nomePlaylist;

    //Construtor
    public Usuario(String nome, String email, String senha, String playlist) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nomePlaylist = playlist;
    }

    //App.Metodos
    public void removerMidias() {

    }

    public void adcionarMidias() {

    }

    public void perfil() {
        System.out.println("=====> PERFIL <=====");
        System.out.printf("Nome: \n" + getNome(),
                "Email: \n" + getEmail(),
                "Playlist: \n" + getNomePlaylist(),
                "");
    }

    //Get - Sett
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }
}
