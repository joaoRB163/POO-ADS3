package exerc_decorator;

public class Main {
    public static void main(String[] args) {
        Bebida cafeSimples = new CafeSimples();

        System.out.println(cafeSimples.getDescricao());
        System.out.println(cafeSimples.getPreco());
        
        System.out.println("-----------------------------");

        System.out.println(new Leite(cafeSimples).getDescricao());
        System.out.println(new Leite(cafeSimples).getPreco());

        System.out.println("-----------------------------");

        System.out.println(new Chocolate(cafeSimples).getDescricao());
        System.out.println(new Chocolate(cafeSimples).getPreco());

        System.out.println("-----------------------------");

        System.out.println(new Leite(new Chocolate(cafeSimples)).getDescricao());
        System.out.println(new Leite(new Chocolate(cafeSimples)).getPreco());
        
        System.out.println();
    }
}
