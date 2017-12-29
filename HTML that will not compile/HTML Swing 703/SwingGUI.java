import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//This is mine
public class SwingGUI extends Applet implements ActionListener
{
	TextField input,output;
	JLable labl;
	Label Labbel, Cats;
	Button enter;
	int num, sum = 0;
	
	
	public void init()
	{
		Labbel = new Label("Are there cats?");
		add(Labbel);
		Labbel.setBackground(Color.blue);
		Labbel.setForeground(Color.orange);
		input = new TextField(5);
		
		add(Cats);
		Cats.setBackground(Color.green);
		Cats.setForeground(Color.blue);
		output = new TextField(30);
		
		add(input);
		Cats = new Label("The amount of cats you entered is: ");
		
		add(output);
		enter = new Button("meow?");
		
		add(enter);
		enter.addActionListener(this);
		labl = new JLabel("MEOW");
		add(labl);
		setBackground(Color.magenta);		
	}
	public void MeowOperations(ActionEvent ae)
	{
		try
		{
		num = Integer.parseInt(input.getText());
		sum = sum+num;
		input.setText("");
		output.setText(Integer.toString(sum));
		labl.seForeground(Color.pink);
		labl.setText("The amount of cats you've entered so far is : " + output.getText());
		} catch(NumberFormatException oops) 
		{
			labl.setForground(Color.red);
			labl.setText("Invalid input.");
		}
	}

}