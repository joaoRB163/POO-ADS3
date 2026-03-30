package interfaces;

public class Main {
    public static void main(String[] args) {

        //se usa interface quando os objetos não tem nada a ver um com o outro, mas possuem uma característica em comum
        
        // não dá para instanciar uma interface, mas pode fazer um vetor dela
        Pagavel[] p = new Pagavel[] {
                new Funcionario("Gustavo", 1500.0),
                new Fatura(500.0),
                new Fatura(2000.0),
                new Funcionario("João", 3000.0)
        };

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].gerarPagamento());
        }

    }
}
