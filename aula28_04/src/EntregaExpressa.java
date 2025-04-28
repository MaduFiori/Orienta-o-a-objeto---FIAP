public class EntregaExpressa extends Entrega{
    public EntregaExpressa(double distancia, String destino) {
        super(distancia, destino);
    }

    public double calcularTempoEntrega() {
        return super.calcularTempoEntrega() / 2;
    }
}
