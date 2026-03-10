package construtores1;

public class Produto {
    private double preco;
    private String nome;
    
    public Produto() {
        nome = "desconhecido";
        preco = 0;
    }
    
    public Produto(String nome) {
        this.nome = nome;
        preco = 0;
    }
    
    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        
}
