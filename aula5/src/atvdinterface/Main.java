package atvdinterface;

public class Main {

    public static void main(String[] args) {
        Operavel[] operaveis = new Operavel[] {
                new Drone("Hype 3000"),
                new Retroescavadeira("Mercedez"),
                new impressora3D("Modelagem 2500"),
                new Drone("ABC 123"),
                new Retroescavadeira("MecaTronn"),
                new impressora3D("Super Mega Blaster Hiper Sonica")
        };

        for (Operavel operavel : operaveis) {
            operavel.ligar();
            operavel.operando();
            operavel.desligar();
            System.out.println("========================");
        }
    }

}
