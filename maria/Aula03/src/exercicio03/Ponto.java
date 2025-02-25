package exercicio03;
public class Ponto {
    // atributos ou variaveis de instância
    int x;
    int y;
    
    // metodo para calcular e retornar a distância entre dois pontos
    public double calcularDistancia(Ponto p){
        double distancia;
        distancia = Math.sqrt(Math.pow(x-p.x, 2) + Math.pow(y-p.y, 2)); 
        
        return distancia;
    }
   
    // método para calcular e retornar a distância de um ponto até a origem
    public double calcularDistanciaAteOrigem(){
        Ponto origem = new Ponto();
        origem.x = 0;
        origem.y = 0;
        return calcularDistancia(origem);
    }

    // método para retornar o ponto mais proximo da origem
    public static Ponto maisProximoPonto(Ponto p1, Ponto p2){
        double distp1 = p1.calcularDistanciaAteOrigem();
        double distp2 = p2.calcularDistanciaAteOrigem();
            if(distp1 < distp2){
                return p1;
            }
            return p2;
    } 

}
