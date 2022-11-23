import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    
    JFrame frame = new JFrame();
    JButton botao = new JButton("Botão 1");
    JButton botao2 = new JButton("Botão 2");
    JLabel label1 = new JLabel("ALo:");
    JPanel pane = new JPanel();
    JTextField txf = new JTextField(10);
    pane.add(botao);
    pane.add(Box.createHorizontalGlue());
    pane.add(botao2);
    pane.add(label1);
    pane.add(txf);
    frame.add(pane, BorderLayout.SOUTH);

  
    botao.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
        botao.setText("Botão 1 alterado.");
      }
    });
    
    botao2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
        botao2.setText("Botão 2 alterado.");
      }
    });

    frame.pack();
    frame.setSize(800, 600);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  
}
