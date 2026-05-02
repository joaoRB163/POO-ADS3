package exerc_observer;

public interface Sujeito {
    
    void adicionarObservador(ClimaObserver observer);
    
    void removerObservador(ClimaObserver observer);

    void notificarObservadores();
}
