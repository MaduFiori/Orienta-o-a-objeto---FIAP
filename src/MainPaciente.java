import java.util.Scanner;

public class MainPaciente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Paciente a = new Paciente();
        double[] alvo;
        
        System.out.println("Nome: ");
        a.nome = teclado.next();
        System.out.println("Idade: ");
        a.idade = teclado.nextInt();
        System.out.println(" ");

        System.out.println("NOME: " + a.nome);
        System.out.println("IDADE: " + a.idade);
        alvo = a.frequenciaAlvo();
        System.out.println("FREQUENCIA MAX: " + a.frequencia());
        System.out.println("FREQUENCIA ALVO MIN: " + alvo[0]);
        System.out.println("FREQUENCIA ALVO MIN: " + alvo[1]);
    }
    
}