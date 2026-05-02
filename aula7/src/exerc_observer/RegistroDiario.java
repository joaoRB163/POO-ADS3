package exerc_observer;

import java.time.Instant;

public class RegistroDiario implements ClimaObserver {

    @Override
    public void atualizar(double temperatura, double umidade) {
        Instant timestamp = Instant.now();
        System.out.println("[LOG] Registro em " + timestamp + ": T= " + temperatura + "°C, U=" + umidade);
    }
    
}
