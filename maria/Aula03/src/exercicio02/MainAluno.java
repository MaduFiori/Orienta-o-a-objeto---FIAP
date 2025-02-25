package exercicio02;
import java.util.Scanner;

public class MainAluno{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Nome aluno: ");
        aluno.nome = teclado.next();
        System.out.println("RM aluno: ");
        aluno.rm = teclado.nextInt();

        for(int i = 0; i < aluno.materias.length; i++){
          System.out.println("Materias: " + (i+1)); 
          System.out.println("Nome: ");
          aluno.materias[i] = teclado.next(); 
          for(int j = 0; j < aluno.notas[i].length; j++ ){
            System.out.println("Notas " + (j+1) + ": ");
            aluno.notas[i][j] = teclado.nextDouble();
          }
        }

        // saida de dados
        System.out.println(" ");
        System.out.println(aluno.nome);
        for(int i = 0; i < aluno.materias.length; i++){
            System.out.println(aluno.materias[i]);
            System.out.println("Média = " + aluno.calcularMedia(i));
            System.out.println("Status = " + aluno.verificarStatus(i));
            System.out.println();
        }
        
    }
}