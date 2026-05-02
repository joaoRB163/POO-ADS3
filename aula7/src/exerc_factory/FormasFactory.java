package exerc_factory;

public class FormasFactory {

    public static Formas criar(String tipo) {
        switch (tipo.toLowerCase()) {
            case "circulo":
                return new Circulo();
            case "quadrado":
                return new Quadrado();
            case "triangulo":
                return new Triangulo();
            default:
                throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
        }
    }
}
