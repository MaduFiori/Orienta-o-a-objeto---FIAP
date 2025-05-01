import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(new Circulo(2,2, 5));
        lista.add(new Cilindro(1,1, 2,2));
        lista.add(new Circulo(4,4, 10));
        lista.add(new Cilindro(3,3, 3, 3));

        for(Forma f : lista){
            if(f instanceof Circulo){
                System.out.println("Círculo");
            }else{
                System.out.println("Cilindro");
            }
            System.out.println(f);
            System.out.println("área = " + f.calcularArea());
            if(f instanceof Cilindro){
                System.out.println("volume = " + ((Cilindro) f).calcularVolume());
            }
            System.out.println("----------------------------------------");
        }
    }
}