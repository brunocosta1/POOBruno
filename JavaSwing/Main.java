import java.awt.event.*;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    
    JFrame frame = new JFrame();
    JButton botao = new JButton("botão");
    
    botao.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
        botao.setText("Botão alterado.");
      }
    });
    
    frame.getContentPane().add(botao);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }

  
}
