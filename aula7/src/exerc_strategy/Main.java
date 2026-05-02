package exerc_strategy;

public class Main {
    public static void main(String[] args) {
        
        Carrinho carrinho = new Carrinho(250.0);
        
        carrinho.setEstrategiaDesconto(new DescontoNenhum());
        System.out.println("Valor final sem desconto: " + carrinho.calcularValorFinal());
        
        carrinho.setEstrategiaDesconto(new DescontoEstudante());
        System.out.println("Valor final com desconto de estudante: " + carrinho.calcularValorFinal());
        
        carrinho.setEstrategiaDesconto(new DescontoBlackFriday());
        System.out.println("Valor final com desconto de Black Friday: " + carrinho.calcularValorFinal());
    }
}
