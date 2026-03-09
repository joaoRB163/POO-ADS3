package polimorfismo2;

public class Main {
    public static void main(String[] args) {
        Dispositivo[] dispositivos = new Dispositivo[3];

        dispositivos[0] = new PCDesktop();
        dispositivos[1] = new Celular();
        dispositivos[2] = new Dispositivo();

        for (Dispositivo dispositivo : dispositivos) {
            dispositivo.Iniciar();
        }
    }
}
