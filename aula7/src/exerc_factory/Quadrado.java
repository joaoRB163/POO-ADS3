package exerc_factory;

public class Quadrado implements Formas {
    private double lado;

    public Quadrado() {
    }

    @Override
    public double calcularArea(double lado) {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
