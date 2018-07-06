import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.lang.*;

class Prob95{
  private JLabel label = new JLabel("It is turn of player1");
  private int x;
  private ArrayList<Integer> p1 = new ArrayList<>();
  private ArrayList<Integer> p2 = new ArrayList<>();

  JButton button1 = new JButton("1");
  JButton button2 = new JButton("2");
  JButton button3 = new JButton("3");
  JButton button4 = new JButton("4");
  JButton button5 = new JButton("5");
  JButton button6 = new JButton("6");
  JButton button7 = new JButton("7");
  JButton button8 = new JButton("8");
  JButton button9 = new JButton("9");

  boolean jadge(ArrayList a){
    if((a.contains(1)&&a.contains(2)&&a.contains(3))||
    (a.contains(4)&&a.contains(5)&&a.contains(6))||
    (a.contains(7)&&a.contains(8)&&a.contains(9))||
    (a.contains(1)&&a.contains(4)&&a.contains(7))||
    (a.contains(2)&&a.contains(5)&&a.contains(8))||
    (a.contains(3)&&a.contains(6)&&a.contains(9))||
    (a.contains(1)&&a.contains(5)&&a.contains(9))||
    (a.contains(3)&&a.contains(5)&&a.contains(7)))
    {return true;}
    else return false;
  }
  void decision(ArrayList a,ArrayList b){
    if(jadge(a)==true)label.setText("player1 win the game!");
    else if(jadge(b)==true)label.setText("player2 win the game!");
    else if(x==9)label.setText("Draw game");
  }
  void changeturn(){
    x++;
    if(x%2==0)label.setText("It is turn of player1");
    if(x%2==1)label.setText("It is turn of player2");
  }

  class ButtonAction1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if(x%2==0){button1.setBackground(Color.RED);
        p1.add(1);}
        else{button1.setBackground(Color.BLUE);
          p2.add(1);}
          changeturn();
          decision(p1,p2);
        }
      }
      class ButtonAction2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
          if(x%2==0){button2.setBackground(Color.RED);
            p1.add(2);}
            else{button2.setBackground(Color.BLUE);
              p2.add(2);}
              changeturn();
              decision(p1,p2);
            }
          }
          class ButtonAction3 implements ActionListener{
            public void actionPerformed(ActionEvent e){
              if(x%2==0){button3.setBackground(Color.RED);
                p1.add(3);}
                else{button3.setBackground(Color.BLUE);
                  p2.add(3);}
                  changeturn();
                  decision(p1,p2);
                }
              }
              class ButtonAction4 implements ActionListener{
                public void actionPerformed(ActionEvent e){
                  if(x%2==0){button4.setBackground(Color.RED);
                    p1.add(4);}
                    else{button4.setBackground(Color.BLUE);
                      p2.add(4);}
                      changeturn();
                      decision(p1,p2);
                    }
                  }
                  class ButtonAction5 implements ActionListener{
                    public void actionPerformed(ActionEvent e){
                      if(x%2==0){button5.setBackground(Color.RED);
                        p1.add(5);}
                        else{button5.setBackground(Color.BLUE);
                          p2.add(5);}
                          changeturn();
                          decision(p1,p2);
                        }
                      }
                      class ButtonAction6 implements ActionListener{
                        public void actionPerformed(ActionEvent e){
                          if(x%2==0){button6.setBackground(Color.RED);
                            p1.add(6);}
                            else{button6.setBackground(Color.BLUE);
                              p2.add(6);}
                              changeturn();
                              decision(p1,p2);
                            }
                          }
                          class ButtonAction7 implements ActionListener{
                            public void actionPerformed(ActionEvent e){
                              if(x%2==0){button7.setBackground(Color.RED);
                                p1.add(7);}
                                else{button7.setBackground(Color.BLUE);
                                  p2.add(7);}
                                  changeturn();
                                  decision(p1,p2);
                                }
                              }
                              class ButtonAction8 implements ActionListener{
                                public void actionPerformed(ActionEvent e){
                                  if(x%2==0){button8.setBackground(Color.RED);
                                    p1.add(8);}
                                    else{button8.setBackground(Color.BLUE);
                                      p2.add(8);}
                                      changeturn();
                                      decision(p1,p2);
                                    }
                                  }
                                  class ButtonAction9 implements ActionListener{
                                    public void actionPerformed(ActionEvent e){
                                      if(x%2==0){button9.setBackground(Color.RED);
                                        p1.add(9);}
                                        else{button9.setBackground(Color.BLUE);
                                          p2.add(9);}
                                          changeturn();
                                          decision(p1,p2);
                                        }
                                      }

                                      public Component createComponents(){
                                        ButtonAction1 button1Listner = new ButtonAction1();
                                        button1.addActionListener(button1Listner);
                                        ButtonAction2 button2Listner = new ButtonAction2();
                                        button2.addActionListener(button2Listner);
                                        ButtonAction3 button3Listner = new ButtonAction3();
                                        button3.addActionListener(button3Listner);
                                        ButtonAction4 button4Listner = new ButtonAction4();
                                        button4.addActionListener(button4Listner);
                                        ButtonAction5 button5Listner = new ButtonAction5();
                                        button5.addActionListener(button5Listner);
                                        ButtonAction6 button6Listner = new ButtonAction6();
                                        button6.addActionListener(button6Listner);
                                        ButtonAction7 button7Listner = new ButtonAction7();
                                        button7.addActionListener(button7Listner);
                                        ButtonAction8 button8Listner = new ButtonAction8();
                                        button8.addActionListener(button8Listner);
                                        ButtonAction9 button9Listner = new ButtonAction9();
                                        button9.addActionListener(button9Listner);

                                        JPanel pane = new JPanel();
                                        pane.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
                                        pane.setLayout(new GridLayout(4,3,10,10));
                                        pane.add(button1);
                                        pane.add(button2);
                                        pane.add(button3);
                                        pane.add(button4);
                                        pane.add(button5);
                                        pane.add(button6);
                                        pane.add(button7);
                                        pane.add(button8);
                                        pane.add(button9);
                                        pane.add(label);
                                        return pane;
                                      }

                                      public static void main(String args[]){
                                        JFrame frame = new JFrame("Prob95");
                                        Prob95 app = new Prob95();
                                        Component contents = app.createComponents();
                                        frame.getContentPane().add(contents,BorderLayout.CENTER);
                                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        frame.pack();
                                        frame.setVisible(true);
                                      }
                                    }
