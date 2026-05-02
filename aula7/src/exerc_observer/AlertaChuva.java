package exerc_observer;

public class AlertaChuva implements ClimaObserver {

    @Override
    public void atualizar(double temperatura, double umidade) {
        if(umidade > 80) {
            System.out.println("[ALERTA] Chuva iminente! Umidade em: . " + umidade + "%");
        }
    }

}