import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Entrega> lista = new ArrayList<>();
        lista.add(new EntregaExpressa(600,"RJ"));
        lista.add(new EntregaInternacional(10000, "NY"));
    }

    for(int i = 0; i < lista.size(); i++){
        System.out.println(lista.get(i).getDestino());
    }

    for(Entrega e : lista){
        System.out.println(lista); //toString()
        //lista.remove(0);
    }
}