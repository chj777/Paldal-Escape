import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Layout2 implements ActionListener {
	
	public JTextField txt = new JTextField(11);
	public JCheckBox Java = new JCheckBox("Java");
	public JCheckBox Cpp = new JCheckBox("C++");
	public JCheckBox Chashtag = new JCheckBox("C#");
	public JButton Set = new JButton("Set");
	public JLabel knows = new JLabel();
	public JLabel LB1 = new JLabel();
	public JLabel LB2 = new JLabel();
	public JLabel LB3 = new JLabel();
	
	
    public static void main(String args[]) {
    	
    	
    	Layout2 gui = new Layout2();
        gui.go();
    }
		
	public void go(){
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Simple Flow Layout");
		
		JPanel panel = new JPanel();
		
		TitledBorder border = BorderFactory.createTitledBorder("Programming experience");
		panel.setBorder(border);
		
		panel.add(new JLabel("Name: "));
		panel.add(txt);
		panel.add(new JLabel("Language: "));
		
		
		panel.add(Java, true);
		
		panel.add(Cpp);
		
		panel.add(Chashtag);
		
		panel.add(Set);
		this.Set.addActionListener(this);
		
		panel.add(knows);
		panel.add(LB1);
		panel.add(LB2);
		panel.add(LB3);
		
        frame.add(BorderLayout.CENTER,panel);
        frame.setSize(500,400);
        frame.setVisible(true);
        
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(this.Set)){
			this.knows.setText(txt.getText()+ " knows languages: ");
			if(Java.isSelected()){
				this.LB1.setText("Java");
			}
			if(Cpp.isSelected()){
				this.LB2.setText("C++");
			}
			if(Chashtag.isSelected()){
				this.LB3.setText("C#");
			}
		}
		
	}
	
}
