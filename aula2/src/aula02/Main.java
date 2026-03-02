package aula02;

public class Main{
    public static void main(String[] args) {
        
        // instanciando dois objetos Carro
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        // alterando valores nos seus atributos
        carro1.modelo = "Opala";
        carro2.modelo = "Fusca";
        
        // chamando métodos
        carro1.Acelerar(40);
        carro2.Acelerar(50);

        // imprimindo valores na tela
        System.out.println("==================ACELERAR====================");
        System.out.println("Velocidade do " + carro1.modelo + ": " + carro1.velocidade + "km/h");
        System.out.println("Velocidade do " + carro2.modelo + ": " + carro2.velocidade + "km/h");
        
        // alterando a velocidade com métodos
        carro1.Frear(20);
        
        // imprimindo valores na tela
        System.out.println("==================FREAR====================");
        System.out.println("Velocidade do " + carro1.modelo + ": " + carro1.velocidade + "km/h");
        System.out.println("Velocidade do " + carro2.modelo + ": " + carro2.velocidade + "km/h");
    }
}