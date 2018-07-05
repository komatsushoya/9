import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Prob93{
  private static String labelPrefix = "Total: ";
  private JLabel label;
  private JTextField text;
  private int x;

  class ButtonAction1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      x = x + Integer.valueOf(text.getText());
      label.setText(labelPrefix + x);
    }
  }
  class ButtonAction2 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      x = 0;
      label.setText(labelPrefix + x);
      text.setText("0");
    }
  }

  public Component createComponents(){
    label = new JLabel(labelPrefix + "0    ");
    text = new JTextField("0",1);
    JButton button1 = new JButton("Add!");
    JButton button2 = new JButton("Clear!");

    ButtonAction1 button1Listner = new ButtonAction1();
    button1.addActionListener(button1Listner);

    ButtonAction2 button2Listner = new ButtonAction2();
    button2.addActionListener(button2Listner);

    JPanel pane = new JPanel();
    pane.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
    pane.setLayout(new BorderLayout());
    pane.add(text,BorderLayout.NORTH);
    pane.add(button1,BorderLayout.WEST);
    pane.add(button2,BorderLayout.EAST);
    pane.add(label,BorderLayout.SOUTH);

    return pane;
  }

  public static void main(String args[]){
    JFrame frame = new JFrame("Prob93");
    Prob93 app = new Prob93();
    Component contents = app.createComponents();
    frame.getContentPane().add(contents,BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);

  }
}
