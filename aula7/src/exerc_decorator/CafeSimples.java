package exerc_decorator;

public class CafeSimples implements Bebida {
    
    private double preco;

    public CafeSimples() {
        this.preco = 3.5;
    }

    @Override
    public String getDescricao() {
        return "Café Simples";
    }

    @Override
    public String getPreco() {
        return "R$" + this.preco;
    }

    
}
