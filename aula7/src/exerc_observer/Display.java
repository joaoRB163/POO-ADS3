package exerc_observer;

public class Display implements ClimaObserver {

    @Override
    public void atualizar(double temperatura, double umidade) {
        System.out.println("[DISPLAY] Temperatura: " + temperatura + "°C, Umidade: " + umidade + "%");
    }
    
}
