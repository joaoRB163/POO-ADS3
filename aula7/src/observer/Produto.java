package observer;

import java.util.ArrayList;
import java.util.List;

public class Produto implements Sujeito {
    private double preco;

    private List<Observador> observadores = new ArrayList<>();

    @Override
    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarTodos(String evento, Object dado) {
        for (Observador o : observadores) {
            o.atualizar(evento, dado);
        }
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
        // Notificando os observadores sobre a mudança de preço
        notificarTodos("PRECO_ALTERADO", novoPreco);
    }

    public double getPreco() {
        return preco;
    }

}