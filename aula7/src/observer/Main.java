package observer;

public class Main {
    public static void main(String[] args) {
        // observadores
        PainelPreco painel1 = new PainelPreco();
        PainelPreco painel2 = new PainelPreco();

        // sujeito
        Produto notebook = new Produto();

        // registrando os painéis como observadores do notebook
        notebook.adicionarObservador(painel1);
        notebook.adicionarObservador(painel2);

        // Uma mudança de preço notifica todos os painéis automaticamente
        notebook.setPreco(2199.00);
        notebook.setPreco(2696.00);
    }
}
