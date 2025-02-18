import java.util.Scanner;

public class Aluno {
    // atributos ou propriedade ou variáveis de instância
    int rm;
    String nome;
    double nota1, nota2;

    //método para calcular e retornar a média
    public double media() {
        return (nota1 + nota2) / 2; 
    }

    //metodo para retornar o status do aluno
    public String status(){
        if (media() >= 7.0){
            return "APROVADO";
        }
        return "REPROVADO";
    }
}
