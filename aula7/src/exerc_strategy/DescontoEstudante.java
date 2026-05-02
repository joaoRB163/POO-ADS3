package exerc_strategy;

public class DescontoEstudante implements EstrategiaDesconto {

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.75;
    }
    
}
