import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//this is the example I found.
public class SApplet extends Applet implements ActionListener {
   TextField input,output;
   Label label1,label2;
   Button b1;
   JLabel lbl;
   int num, sum = 0;
   
   public void init() {
      label1 = new Label("please enter number : ");
      add(label1);
      label1.setBackground(Color.blue);
      label1.setForeground(Color.green);
      input = new TextField(5);
      
      add(input);
      label2 = new Label("Sum : ");
      
      add(label2);
      label2.setBackground(Color.red);
      label2.setForeground(Color.magenta);
      output = new TextField(20);
      
      add(output);
      b1 = new Button("Add");
      
      add(b1);
      b1.addActionListener(this);
      lbl = new JLabel("Swing Applet Example. ");
      add(lbl);
      setBackground(Color.yellow);
   } 
   public void actionPerformed(ActionEvent ae ){
      try {
         num = Integer.parseInt(input.getText());
         sum = sum+num;
         input.setText("");
         output.setText(Integer.toString(sum));
         lbl.setForeground(Color.orange);
         lbl.setText("Output of the second Text Box : " + output.getText());
      } catch(NumberFormatException e) {
         lbl.setForeground(Color.pink);
         lbl.setText("Invalid Entry!");
      }
   }  
}