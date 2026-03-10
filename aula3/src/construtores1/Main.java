package construtores1;

public class Main {
    public static void main(String[] args) {

        // Produtos();

        Pessoas();

    }

    public static void Pessoas(){
        
        Pessoa pessoa1 = new Pessoa("123.456.789-00", "Gerivaldo");
        Funcionario pessoa2 = new Funcionario("009.876.543-21", "Gilberto", 2890.6);
        System.out.println("Pessoa: " + pessoa1.getNome() + "\nCPF: " + pessoa1.getCpf());
        System.out.println("Pessoa: " + pessoa2.getNome() + "\nCPF: " + pessoa2.getCpf() + "\nSalario: R$" + pessoa2.getSalario());

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
