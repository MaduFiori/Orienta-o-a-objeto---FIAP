public class Paciente {
    String nome;
    int idade;

    //metodo retornar frequencia
    public double frequencia(){
        return (220 - idade);
    }

    //metodo frequencia alvo
    public double[] frequenciaAlvo(){
        double[] alvo = new double[2]; 
        double maxima = frequencia();
        alvo[0] = maxima * 0.5;
        alvo[1] = maxima * 0.85;
        return alvo;
    }

}
