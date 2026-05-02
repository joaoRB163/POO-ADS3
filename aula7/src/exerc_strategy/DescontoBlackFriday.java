package exerc_strategy;

public class DescontoBlackFriday implements EstrategiaDesconto {

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.6;
    }
    
}
