package exerc_observer;

import java.util.ArrayList;
import java.util.List;

public class Estacao implements Sujeito {
    
    private double temperatura;
    private double umidade;
    
    private List<ClimaObserver> observadores = new ArrayList<>();

    public void setMedidas(double temperatura, double umidade) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        notificarObservadores();
    }

    @Override
    public void adicionarObservador(ClimaObserver observer) {
        observadores.add(observer);
    }

    @Override
    public void removerObservador(ClimaObserver observer) {
        observadores.remove(observer);
    }

    @Override
    public void notificarObservadores() {
        for(ClimaObserver obs : observadores) {
            obs.atualizar(temperatura, umidade);
        }
        System.out.println();
    }
    
}
