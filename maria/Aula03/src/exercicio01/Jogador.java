package exercicio01;
import java.util.Scanner;

public class Jogador {
    String nome;
    int [] score = new int[3];

    public int scoreTotal(){
        int total = 0;
        for (int i=0; i < score.length; i++){
            total += score[i];
        }
        return total;
    }
}