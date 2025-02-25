package exercicio01;
import java.util.Scanner;

public class MianJogador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Jogador jogador = new Jogador();

        // entrada de dados
        System.out.println("Nome do jogador: ");
        jogador.nome = teclado.next();
        System.out.println("Pontuação: ");
        for (int i = 0; i < jogador.score.length; i++) {
            System.out.println("Rodada " + (i + 1) + ": ");
            jogador.score[i] = teclado.nextInt();
        }

        // saída de dados
        System.out.println("\nJogador: " + jogador.nome);
        System.out.println("Score total: " + jogador.scoreTotal());
    }
}
