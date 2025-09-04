package App.Main;
import App.Entities.Catalogo;
import App.Entities.Playlist;
import App.Entities.Usuario;
import App.Metodos.ApresentarCatalogo;
import App.Metodos.Autenticacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Bem Vindo ao PlayMusic =====");
        System.out.println("======> MENU <=====");
        System.out.println("""
                [ 1 ] Abrir Conta
                [ 2 ] Entrar
                """);
        System.out.print("Opção: ");
        String opcao = input.nextLine();
        while (!opcao.equals("1") && !opcao.equals("2")) {
            System.out.println("ERRO; Entrada Invalida!");
            System.out.println("Opcao: ");
            opcao = input.nextLine();
        }
        int numopcao = Integer.parseInt(opcao);
        switch (numopcao) {
            case 1:
                System.out.println("-> Faça sua conta <-");
                System.out.print("Digite seu nome: ");
                String nome = input.nextLine();
                while (nome.trim().isEmpty()) {
                    System.out.println("ERRO; Entrada Invalida!");
                    System.out.print("Digite seu nome: ");
                    nome = input.nextLine();
                }
                System.out.print("Digite seu email: ");
                String email = input.nextLine();
                while (email.trim().isEmpty() && !email.contains("@") || !email.contains(".com")) {
                    System.out.println("ERRO; Entrada Invalida!");
                    System.out.println("Verifique se contem ( @ ) e ( .com )");
                    System.out.print("Digite seu email: ");
                    email = input.nextLine();
                    input.nextLine(); // limpa o buffer
                }
                System.out.print("Digite uma senha: ");
                String password = input.nextLine();
                while (password.trim().isEmpty() && password.length() < 5) {
                    System.out.println("ERRO; Entrada Invalida!");
                    System.out.print("Digite uma senha: ");
                    password = input.nextLine();
                }
                System.out.print("Nome da Playlist: ");
                String nomePlaylist = input.nextLine();
                while (nomePlaylist.trim().isEmpty()) {
                    System.out.println("EERRO; Entrada Invalida!");
                    System.out.print("Nome da Playlist: ");
                    nomePlaylist = input.nextLine();
                    System.out.println(" ");
                    input.nextLine(); // limpa o buffer
                    Playlist playlist = new Playlist(nome, password, nomePlaylist);
                }
                Usuario usuario = new Usuario(nome, email, password, nomePlaylist);

                break;

            case 2:
                System.out.println("======> PlayMusic <=====");
                System.out.println(" ");
                System.out.println("   Acessar Conta");
                System.out.println(" ");
                while (true) {
                    System.out.print("Nome: ");
                    String login = input.nextLine();
                    System.out.print("Senha: ");
                    String senha = input.nextLine();
                    if (Autenticacao.autenticar(login, senha)) {
                        System.out.println("Bem vindo " + login + "ao PlayMusic");
                        break;
                    } else {
                        System.out.println("Login ou Senha Incorreto!" +
                                "Tente Novamente!");
                    }
                }
        }
        Catalogo biblioteca = new Catalogo();
        int opcaoMenu = 0;
        do {
            System.out.println("=====> MENU <=====");
            System.out.println(" ");
            System.out.printf("""
                    [ 1 ] Biblioteca
                    [ 2 ] Minhas Musicas
                    [ 3 ] Adcionar Musica
                    [ 4 ] Remover Musica
                    [ 5 ] Perquisar
                    [ 6 ] Tempo Total da Playlist
                    [ 7 ] Perfil
                    [ 8 ] Sair
                    """);
            try {
                System.out.println(" ");
                System.out.println("Sua opção: ");
                opcaoMenu = input.nextInt();

                switch (opcaoMenu) {
                    case 1 -> ApresentarCatalogo.apresentacaoCatalogo();
                    case 2 -> System.out.println("Exibindo Minhas Músicas...");
                    case 3 -> System.out.println("Adicionando Música...");
                    case 4 -> System.out.println("Removendo Música...");
                    case 5 -> System.out.println("Pesquisando...");
                    case 6 -> System.out.println("Calculando Tempo Total...");
                    case 7 -> System.out.println("Abrindo Perfil...");
                    case 8 -> System.out.println("Saindo... Até logo!");
                    default -> System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número de 1 a 8.");
                System.out.println(" ");
                input.nextLine(); // limpa o buffer
            }
        } while (opcaoMenu != 8);
    }
}