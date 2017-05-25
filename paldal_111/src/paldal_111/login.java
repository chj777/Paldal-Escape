package paldal_111;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class login implements ActionListener{
   private JFrame f;
   private JTextField t1,t2;
   private JLabel l1,l2;
   private JPanel p;
   private JButton b1,b2;
   
   public void go(){
      f=new JFrame();
      t1=new JTextField(20); t2=new JTextField(20);
      l1=new JLabel("ID"); l2=new JLabel("PASSWD");
      p=new JPanel();
      b1=new JButton("LOGIN");    b2=new JButton("REGISTER");
      
      b1.addActionListener(this); b2.addActionListener(this);
      p.add(l1); p.add(t1);p.add(l2);p.add(t2);p.add(b1);p.add(b2);
      
      f.add(p);
      f.setSize(100, 100);
      f.setVisible(true);
   
   }
   @Override
   public void actionPerformed(ActionEvent arg0) {
      if(arg0.getSource().equals(b1)&&t1.getText().equals(new Student().getName())&&t2.getText().equals(new Student().getName())){
         b1.setText("LOGOUT"); 
         new MainHome().go();
      if(arg0.getSource().equals(b2)){
         
      }
      }
      else{
         JLabel l=new JLabel("Again Login!");
         JFrame k=new JFrame();
         k.add(l);
         k.setSize(50, 50);k.setVisible(true);
         t1.setText("");
         t2.setText("");
      }
      
   }
   public static void main(String[] args) {
      new login().go();
   }


}
