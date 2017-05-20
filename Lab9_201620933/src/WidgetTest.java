import javax.swing.JFrame;

public class WidgetTest {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyWidget m = new MyWidget();
		frame.add(m);
		
		frame.setSize(1000, 700);
		frame.setVisible(true);
	}

}
