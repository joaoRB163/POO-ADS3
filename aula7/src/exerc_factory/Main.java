package exerc_factory;

public class Main {

    public static void main(String[] args) {
        Formas circulo = new Circulo();
        Formas quadrado = new Quadrado();
        Formas triangulo = new Triangulo();

        double areaCirculo = circulo.calcularArea(5);
        double areaQuadrado = quadrado.calcularArea(4);
        double areaTriangulo = triangulo.calcularArea(6, 3);

        System.out.println("Área do Círculo: " + areaCirculo);
        System.out.println("Área do Quadrado: " + areaQuadrado);
        System.out.println("Área do Triângulo: " + areaTriangulo);
    }
    
}
