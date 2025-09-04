package App.Metodos;
import App.Entities.Midias;
import static App.Entities.Catalogo.musicas;

public class ApresentarCatalogo {
    public static void apresentacaoCatalogo() {
        System.out.println("                    =====> Biblioteca <=====");
        System.out.printf("%-30s %-20s %-10s %-10s%n", "Título", "Artista", "Duração", "Gênero");
        System.out.println("--------------------------------------------------------------------");

        // Percorre todas as músicas
        for (Midias musica : musicas.values()) {
            System.out.printf("%-30s %-20s %-10s %-10s%n",
                    musica.getTitulo(),
                    musica.getArtista(),
                    musica.getDuracao(),
                    musica.getGenero());
        }
        System.out.println("--------------------------------------------------------------------\n");
    }
}
