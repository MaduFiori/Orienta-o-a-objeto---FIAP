import java.util.Random;

public class TesteVetor {
    public static void main (String[] args){
        //declarar um vetor de inteiros
        int teste [] = new int [5];

        // método para preencher o vetor
        lerDados(teste);
        imprimir(teste);
            
    }
    public static void imprimir(int[] teste){
        for (int i = 0; i < teste.length; i++){
            System.out.println(teste[i]);
        } 
        
        // for each
        for (int i : teste){
            System.out.println(i);
        }
    }

  

    public static void lerDados(int[] teste) {
        Random rd = new Random();
            for(int i = 0; i < teste.length; i++){
                teste[i] = rd.nextInt();
            }
    }
}
