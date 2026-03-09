package polimorfismo2;

public class Celular extends Dispositivo{
    @Override
    public void Iniciar() {
        System.out.println("Você acionou o bluetooth após iniciar.");
    }
}
