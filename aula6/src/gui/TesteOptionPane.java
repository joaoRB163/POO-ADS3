package gui;

import javax.swing.JOptionPane;

public class TesteOptionPane {
    public static void main(String[] args) {
        double a, b;
        double c = 0;
        String[] opc = {"a", "b", "c"};
        
        a = Double.valueOf(JOptionPane.showInputDialog("Digite um valor para A"));
        b = Double.valueOf(JOptionPane.showInputDialog("Digite um valor para B"));

        JOptionPane.showOptionDialog(null, "Escolha", "Titulo", 0, 0, null, opc, opc[0]);
        
        if(b != 0){
            c = a / b;
            JOptionPane.showMessageDialog(null, "A / B = " + c); 
        } else {
            JOptionPane.showMessageDialog(null, "B = 0, divisão inválida!");
        }
    }
}
