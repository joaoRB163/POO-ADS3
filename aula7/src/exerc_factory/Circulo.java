package exerc_factory;

public class Circulo implements Formas {
    private double raio;

    public Circulo() {
    }

    @Override
    public double calcularArea(double raio) {
        return Math.round((Math.PI * Math.pow(raio, 2)) * 100.0) / 100.0;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
}
