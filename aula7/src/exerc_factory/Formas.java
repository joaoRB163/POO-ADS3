package exerc_factory;

public interface Formas {

    default double calcularArea(double dimensao) {
        return 0;
    }

    default double calcularArea(double base, double altura) {
        return 0;
    }

}
