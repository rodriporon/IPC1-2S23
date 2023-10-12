package interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Autenticacion extends JFrame {
    private JButton button1;
    private JPanel panel1;
public Autenticacion() {
    super("Autenticación");
    setContentPane(panel1);
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Hola mundo");
        }
    });

    //setContentPane(panel1);
    pack();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
