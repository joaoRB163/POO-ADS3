package strategy;

import java.util.List;

public class Catalogo {
    private List<Produto> produtos;
    private EstrategiaOrdenacao estrategia;

    public Catalogo(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setEstrategia(EstrategiaOrdenacao estrategia) {
        this.estrategia = estrategia;
    }

    public void exibir() {
        if (estrategia != null) {
            estrategia.ordenar(produtos);
        }
        produtos.forEach(p -> System.out.println(p.getNome() + " - R$ " + p.getPreco() + " - Nota: " + p.getNota()));
    }
}