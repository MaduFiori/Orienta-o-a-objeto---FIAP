public class EntregaInternacional extends Entrega{
    public EntregaInternacional(double distancia, String destino) {
        super(distancia, destino);
    }

    @Override
    public double calcularTempoEntrega() {
        return super.calcularTempoEntrega() + 5;
    }
}
