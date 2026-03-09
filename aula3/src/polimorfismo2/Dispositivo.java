package polimorfismo2;

public class Dispositivo {
    private String modelo;

    public void Iniciar(){
        System.out.println("Você iniciou um dispositivo");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
