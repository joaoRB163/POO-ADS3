package strategy;

import java.util.Comparator;
import java.util.List;

public class OrdenarPorNome implements EstrategiaOrdenacao {
    @Override
    public void ordenar(List<Produto> produtos) {
        produtos.sort(Comparator.comparing(Produto::getNome));
        System.out.println("Ordenado por nome");
    }
}