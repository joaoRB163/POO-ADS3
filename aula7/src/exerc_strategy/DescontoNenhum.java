package exerc_strategy;

public class DescontoNenhum  implements EstrategiaDesconto {

    @Override
    public double calcularDesconto(double valor) {
        return valor;
    }
    
}
