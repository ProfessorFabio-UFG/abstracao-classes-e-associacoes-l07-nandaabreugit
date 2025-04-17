import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de compositor:  \n");
        System.out.print("Nome do compositor: ");
        String nomeComp = scanner.nextLine();
        System.out.print("Nacionalidade do compositor: ");
        String nacionalidade = scanner.nextLine();
        Compositor compositor = new Compositor(nomeComp, nacionalidade);

        System.out.println("Cadastro de musica:  \n");
        System.out.print("Nome da musica: ");
        String nomeMusica = scanner.nextLine();
        System.out.print("Ano da musica: ");
        int ano = scanner.nextInt(); scanner.nextLine();
        System.out.print("Tipo da musica: ");
        String tipo = scanner.nextLine();
        Musica musica = new Musica(nomeMusica, ano, tipo, compositor);

        System.out.println("\n" + musica);
    }
}
