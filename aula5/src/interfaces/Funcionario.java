package interfaces;

public class Funcionario implements Pagavel{

    private String nome;
    private Double salarioBase;

    public Funcionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // implementação do método gerarPagamento da interface Pagavel
    @Override
    public double gerarPagamento() {
        return this.salarioBase * 1.3;
    }

}
