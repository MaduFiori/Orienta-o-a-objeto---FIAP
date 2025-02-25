package exercicio03;
import java.util.Scanner;

public class PontoMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        p1.x = 2;
        p1.y = 2;

        p2.x = 7;
        p2.y = 7;

        System.out.println("distancia do p1 para p2: " + p1.calcularDistancia(p2));
        System.out.println("distancia do p2 para p1: " + p2.calcularDistancia(p1));

        // impressao da distancia de cada ponto ate a origem
        System.out.println("distancia do p1 ate a origem: " + p1.calcularDistanciaAteOrigem());
        System.out.println("distancia do p1 ate a origem: " + p2.calcularDistanciaAteOrigem());
    }
}
