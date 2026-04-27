package strategy;

import java.util.Comparator;
import java.util.List;

public class OrdenarPorNota implements EstrategiaOrdenacao {
     @Override 
    public void ordenar(List<Produto> produtos) { 
        produtos.sort(Comparator.comparing(Produto::getNota)); 
        System.out.println("Ordenado por nota"); 
    }
}