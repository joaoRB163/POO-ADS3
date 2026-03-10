package construtores1;

public class Main {
    public static void main(String[] args) {
        
        Produtos();

        // Pessoas();

    }

    public static void Pessoas(){
        Pessoa p = new Pessoa("123.456.789-00", "Gerivaldo");

        System.out.println("Pessoa: " + p.getNome() + "\nCPF: " + p.getCpf());
    }
    
    public static void Produtos(){
        
        Produto[] produtos = new Produto[3];
        
        produtos[0] = new Produto();
        produtos[1] = new Produto("Banana");
        produtos[2] = new Produto(5.99, "Maça");

        for (Produto produto : produtos) {
            System.out.println("Produto 1: " + produto.getNome() + "\nPreço: R$" + produto.getPreco());
        }
    }
}
