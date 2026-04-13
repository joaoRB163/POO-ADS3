package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JFrame {

    public Janela() {
        super("Minha Janela");
        setSize(700, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel p = new JPanel();
        add(p);

        JTextField text1 = new JTextField(10);
        p.add(text1);
        JTextField text2 = new JTextField(10);
        p.add(text2);
        JTextField text3 = new JTextField(10);
        p.add(text3);

        JButton b1 = new JButton("Enviar");
        p.add(b1);

        b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
                double soma = Double.valueOf(text1.getText()) + Double.valueOf(text2.getText());

                text3.setText(String.valueOf(soma));
                
			}
		});
    }
    
}
