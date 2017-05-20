

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Layout3 implements ActionListener {
	
	JTextField txt = new JTextField(30);
	JList<String> list = new JList<String>(new String[]{"Bibimbap", "Bulgogi", "Pizza", "Kimchi burger", "Pasta", "Rice cake"});
	JScrollPane scroller = new JScrollPane(list);
	JButton Set = new JButton("Set");
	JLabel JL = new JLabel();
	
	public static void main(String[] args) {
		Layout3 gui = new Layout3();
		gui.go();
	}
	
	public void go(){
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		TitledBorder border = BorderFactory.createTitledBorder("Programming experience");
		panel.setBorder(border);
		
		panel.add(txt);

		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroller);
		
		panel.add(Set);
		Set.addActionListener(this);
		
		panel.add(JL);
		
      frame.add(BorderLayout.CENTER,panel);
        frame.setSize(500,400);
        frame.setVisible(true);
        frame.setTitle("Simple Box Layout");
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(this.Set)){

			
			String s=" ";
			List<String> selected = list.getSelectedValuesList();
			for(String item : selected) {
				s+=" "+item;
			}
			this.JL.setText(txt.getText()+" likes dishes: "+s);
			
		}
	}
	
}
