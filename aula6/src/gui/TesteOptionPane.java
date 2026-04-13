package gui;

import javax.swing.JOptionPane;

public class TesteOptionPane {
    public static void main(String[] args) {
        double a, b;
        double c = 0;
        
        a = Double.valueOf(JOptionPane.showInputDialog("Digite um valor para A"));
        b = Double.valueOf(JOptionPane.showInputDialog("Digite um valor para B"));

        if(b != 0){
            c = a / b;
            JOptionPane.showMessageDialog(null, "A / B = " + c); 
        } else {
            JOptionPane.showMessageDialog(null, "B = 0, divisão inválida!");
        }
    }
}
