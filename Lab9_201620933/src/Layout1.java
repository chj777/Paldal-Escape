
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Layout1 implements ActionListener {
	
	private JButton JB1;
	private JButton JB2;
	private JButton JB3;
	private JButton JB4;
	private JTextField JT1;
	private JTextField JT2;
	private JTextField JT3;
	private JTextField JT4;

	public static void main(String[] args) {
		new Layout1().go();
	}

	public void go() {
		
		 

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Simple Grid Layout");
		frame.setLayout(new GridLayout(4, 3, 5, 5));
		
		
		frame.add(new JLabel("Name: "));
		this.JT1 = new JTextField(" ") ;
		frame.add(this.JT1);
		this.JB1 = new JButton("Name ");
		frame.add(this.JB1);
		this.JB1.addActionListener(this);

		frame.add(new JLabel("ID: "));
		this.JT2 = new JTextField(" ") ;
		frame.add(this.JT2);
		this.JB2 = new JButton("ID ");
		frame.add(this.JB2);
		this.JB2.addActionListener(this);
		
		frame.add(new JLabel("Major: "));
		this.JT3 = new JTextField(" ") ;
		frame.add(this.JT3);
		this.JB3 = new JButton("Major ");
		frame.add(this.JB3);
		this.JB3.addActionListener(this);	
		
		frame.add(new JLabel("Class: "));
		this.JT4 = new JTextField(" ") ;
		frame.add(this.JT4);
		this.JB4 = new JButton("Class ");
		frame.add(this.JB4);
		this.JB4.addActionListener(this);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(this.JB1)){
			this.JT1.setText("Choi HyeJee");
		}
		
		if(arg0.getSource().equals(this.JB2)){
			this.JT2.setText("201620933");
		}

		if(arg0.getSource().equals(this.JB3)){
			this.JT3.setText("Software");
		}
		
		if(arg0.getSource().equals(this.JB4)){
			this.JT4.setText("OOP");
		}
		
	}
}

