package strategy;

import java.util.Comparator;
import java.util.List;

public class OrdenarPorPreco implements EstrategiaOrdenacao {
    @Override
    public void ordenar(List<Produto> produtos) {
        produtos.sort(Comparator.comparing(Produto::getPreco));
        System.out.println("Ordenado por preço");
    }
}