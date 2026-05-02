package exerc_factory;

public class Main {

    public static void main(String[] args) {
        Formas circulo = FormasFactory.criar("circulo");
        Formas quadrado = FormasFactory.criar("quadrado");
        Formas triangulo = FormasFactory.criar("triangulo");

        System.out.println("Área do Círculo: " + circulo.calcularArea(5));
        System.out.println("Área do Quadrado: " + quadrado.calcularArea(4));
        System.out.println("Área do Triângulo: " + triangulo.calcularArea(6, 3));
    }
    
}
