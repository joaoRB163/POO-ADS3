package exerc_observer;

public class Main {
    public static void main(String[] args) {
        Estacao estacao1 = new Estacao();
        Estacao estacao2 = new Estacao();

        Display display = new Display();
        RegistroDiario registro = new RegistroDiario();
        AlertaChuva alerta = new AlertaChuva();

        estacao1.adicionarObservador(display);
        estacao1.adicionarObservador(registro);
        estacao1.adicionarObservador(alerta);

        estacao2.adicionarObservador(display);
        estacao2.adicionarObservador(registro);
        estacao2.adicionarObservador(alerta);
        
        System.out.println("\n================Estação 1================");
        estacao1.setMedidas(25.5, 60);
        System.out.println("================================");
        estacao1.setMedidas(22.0, 85);
        System.out.println("================Estação 2================");
        estacao2.setMedidas(28.0, 85);
        estacao2.removerObservador(alerta);
        System.out.println("================Estação 2 - Sem Alerta de Chuva================");
        estacao2.setMedidas(20.0, 90);
    }
}
