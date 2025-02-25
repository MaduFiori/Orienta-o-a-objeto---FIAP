package exercicio02;
public class Aluno {
    String nome;
    int rm;
    String [] materias = new String [3];
    double [][] notas = new double [materias.length][2];

    public double calcularMedia(int i){
        double media = 0;
        for(int j = 0; j < notas[i].length; j++){
            media += notas[i][j];
        }
        return media / notas[i].length;
    }

    // metodo para retornar o status do aluno em uma disciplina
    public String verificarStatus(int i){
        if(calcularMedia(i) >= 6){
            return "APROVADO";
        }
        return "REPROVADO";
    }
}
