import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Digite seu nome: ");
        a.nome = teclado.next();
        teclado.nextLine();
        System.out.println("Digite seu rm: ");
        a.rm = teclado.nextInt();
        System.out.println("Digite sua primeira nota: ");
        a.nota1 = teclado.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        a.nota2 = teclado.nextDouble();

        System.out.println(a);

        System.out.println();
        System.out.println("RM: " + a.rm + " NOME: " + a.nome);
        System.out.println("NOTA 1: " + a.nota1);
        System.out.println("NOTA 2: " + a.nota2);
        System.out.println("MÉDIA: " + a.media());
        System.out.println("Status: " + a.status());

    }
}
