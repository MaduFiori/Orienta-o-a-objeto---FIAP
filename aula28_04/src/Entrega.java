public class Entrega {
    private String destino;
    private double distancia;

    public Entrega(double distancia, String destino) {
        this.distancia = distancia;
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public double calcularTempoEntrega(){
        return distancia/100;
    }

    @Override
    public String toString() {
        return destino + " "
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
