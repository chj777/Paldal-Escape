import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class login implements ActionListener {

	private static final Icon INFORMATION_MESSAGE = null;
	private JFrame f;
	private JTextField t1, t2;
	private JLabel l1, l2;
	private JPanel p;
	private JButton b1, b2, b3;
	private Student mother = new Student();
	private MainHome mainhome;
	
	
	public String gett1Text() {
		return t1.getText();
	}

	public String gett2Text() {
		return t2.getText();
	}

	public void go(Student s_input) {

		this.mother = s_input;

		f = new JFrame();
		t1 = new JTextField(20);
		t2 = new JTextField(20);

		l1 = new JLabel("ID");
		l2 = new JLabel("PASSWD");
		p = new JPanel();
		b1 = new JButton("LOGIN");
		b2 = new JButton("REGISTER");
		b3 = new JButton("LOGOUT");
		

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(b1);
		p.add(b3);
		p.add(b2);

		f.getContentPane().add(p);
		f.setSize(938, 100);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void go2() {
		login l1 = new login();
		l1.go(mother);
		// String[] s=new String[12];
		ArrayList<String> s = new ArrayList<String>();
		s = mother.getName();

	}

	public static void main(String[] args) {
		login l = new login();
		l.go2();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// String[] s1=new String[100];
		// String[] s2=new String[100];
		ArrayList<String> s1 = new ArrayList<String>();
		ArrayList<String> s2 = new ArrayList<String>();

		s1 = this.mother.getName();
		s2 = this.mother.getPW();
		// System.out.println(s1.get(1));

		if (arg0.getSource().equals(b1)) 
		{
			UserInformation newuser = new UserInformation(this.t1.getText(),this.t2.getText());
			UserManagement UM = new UserManagement();
			if(UM.login_user(newuser))
			{
				UserInformation currentUser = UM.getCurrentLoginUser();
				mainhome = new MainHome(currentUser);
				mainhome.go();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Æ²·È¾î ÀÓ¸¶.");
			}
//			int i = 0;
//			int n = 0;
//			while (n < s1.size()) {
//
//				if (t1.getText().trim().equals(s1.get(i)) && t2.getText().trim().equals(s2.get(i))) {
//					// b1.setText("LOGOUT");
//
//					mainhome = new MainHome();
//					mainhome.go();
//					// new Character(this);
//					break;
//
//				}
//				i++;
//				n++;
//			}

		} else if (arg0.getSource().equals(b2)) {
			if(this.t1.getText().length() != 0 && this.t2.getText().length() != 0)
			{
				
				UserInformation newuser = new UserInformation(this.t1.getText(),this.t2.getText());
				UserManagement manage = new UserManagement();
				manage.newuser_adding(newuser);
				this.t1.setText("");
				this.t2.setText("");
			}
//			int n2 = 0;
//			int n3 = 0;
//			int n4 = 0;
//			while (n4 < s1.size()) {
//				if (!(t1.getText().trim().equals(s1.get(n2)))) {
//					n3++;
//				}
//				n2++;
//				n4++;
//
//			}
//			System.out.println(s1.size());
//			if (n3 >= s1.size()) {
//				new Register(this);
//
//			} else if (n3 < s1.size()) {
//				JOptionPane.showMessageDialog(null, "Alreadt exist ID", "", JOptionPane.INFORMATION_MESSAGE);
//			}

		}

		else if (arg0.getSource().equals(b3)) {
			if(mainhome != null)
			{
				this.t1.setText("");
				this.t2.setText("");
				mainhome.f.setVisible(false);
				mainhome.f.dispose();
				mainhome = null;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
			}
		}

	}

}
