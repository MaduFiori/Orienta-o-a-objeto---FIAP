public class Teste2 {
    public static void main(String[] args) {
        System.out.println(somar(2,3));
        System.out.println(somar(2,3,4));
        System.out.println(somar(1,3,3,5,6));
    }
    //para saber o tamanho do vetor = teste.length
    public static int somar(int ...teste){
        int soma = 0;
        for(int i : teste){
            soma += 1;
        }
        return soma;
    }
}
