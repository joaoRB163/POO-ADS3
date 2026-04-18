package atvdsugerida;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calc extends JFrame{

    public Calc() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setVisible(true);

        JPanel p = new JPanel();

        add(p);

        JButton b1 = new JButton("Soma");
        JButton b2 = new JButton("Sub");
        JButton b3 = new JButton("Div");
        JButton b4 = new JButton("Mult");
        JButton b5 = new JButton("Limpar");

        JTextField a = new JTextField(3);
        JTextField b = new JTextField(3);

        JTextArea r = new JTextArea(1, 8);

        p.add(a);
        p.add(b);
        p.add(r);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);

        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                r.setText(String.valueOf(Double.valueOf(a.getText()) + Double.valueOf(b.getText())));
            }
        });

        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                r.setText(String.valueOf(Double.valueOf(a.getText()) - Double.valueOf(b.getText())));
            }
        });

        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Double.valueOf(b.getText()) != 0){
                    r.setText(String.valueOf(Double.valueOf(a.getText()) / Double.valueOf(b.getText())));
                } else {
                    r.setText("Erro ao dividir");
                }
            }
        });

        b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                r.setText(String.valueOf(Double.valueOf(a.getText()) * Double.valueOf(b.getText())));
            }
        });

        b5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setText("");
                b.setText("");
                r.setText("");
            }
        });
    }
    
}
