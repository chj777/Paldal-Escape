
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainHome implements ActionListener {
	JFrame f;
	private JButton[] b;
	JPanel p;
	boolean bh;
	int i1 = 0;
	int[] a = new int[1000];
	UserInformation user;

	public MainHome(UserInformation user_input) {
		this.user = user_input;
	}

	public void go() {
		f = new JFrame();
		p = new JPanel();
		b = new JButton[10];

		Professor pro = new Professor();

		a = pro.store_ans("answer.txt");///////////////////////////////////////////////////

		b[0] = new JButton(10 + "");
		b[1] = new JButton(9 + "");
		b[2] = new JButton(8 + "");
		b[3] = new JButton(7 + "");
		b[4] = new JButton(6 + "");
		b[5] = new JButton(5 + "");
		b[6] = new JButton(4 + "");
		b[7] = new JButton(3 + "");
		b[8] = new JButton(2 + "");
		b[9] = new JButton(1 + "");



		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

		for (int i = 1; i < 10; i++) {
			b[i].setEnabled(false);
		}

		for (int count = 0; count <= user.getStage(); count++) {
			try {
				b[count].setEnabled(true);
			} catch (Exception ex) {

			}
		}
		
		for (int i = 0; i < 10; i++) {
			b[i].addActionListener(this);
		}

		for (int i = 0; i < 10; i++)
			p.add(b[i]);

		f.add(p, BorderLayout.CENTER);
		f.setSize(1000, 1000);
		f.setVisible(true);

	}

	public void change_button_enable(int number, boolean key) {
		this.b[i1].setEnabled(key); 
		int user_index = new UserManagement().get_user_index(this.user);
		this.user.setStage(i1);
		new UserManagement().update_user(this.user, user_index);

	}  

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(b[0])) {
			i1 = 1;
			new Floor(a[0], a[1], a[2], "10.txt", "10-1.txt", "10-2.txt", "10-3.txt", this);
		}

		if (e.getSource().equals(b[1])) {
			i1 = 2;
			new Floor(a[3], a[4], a[5], "9.txt", "9-1.txt", "9-2.txt", "9-3.txt", this);
		}
		if (e.getSource().equals(b[2])) {
			i1 = 3;
			new Floor(a[6], a[7], a[8], "8.txt", "8-1.txt", "8-2.txt", "8-3.txt", this);
		}
		if (e.getSource().equals(b[3])) {
			i1 = 4;
			new Floor(a[9], a[10], a[11], "7.txt", "7-1.txt", "7-2.txt", "7-3.txt", this);
		}
		if (e.getSource().equals(b[4])) {
			i1 = 5;
			new Floor(a[12], a[13], a[14], "6.txt", "6-1.txt", "6-2.txt", "6-3.txt", this);
		}
	
		if (e.getSource().equals(b[5])) {
			i1 = 6;
			new Floor(a[15], a[16], a[17], "5.txt", "5-1.txt", "5-2.txt", "5-3.txt", this);
		}
		if (e.getSource().equals(b[6])) {
			i1 = 7;
			new Floor(a[18], a[19], a[20], "4.txt", "4-1.txt", "4-2.txt", "4-3.txt", this);
		}
		if (e.getSource().equals(b[7])) {
			i1 = 8;
			new Floor(a[21], a[22], a[23], "3.txt", "3-1.txt", "3-2.txt", "3-3.txt", this);
		}
		if (e.getSource().equals(b[8])) {
			i1 = 9;
			new Floor(a[24], a[25], a[26], "2.txt", "2-1.txt", "2-2.txt", "2-3.txt", this);
		}
		if (e.getSource().equals(b[9])) {

			new Floor(a[27], a[28], a[29], "1.txt", "1-1.txt", "1-2.txt", "1-3.txt", this);
		}

	}

}
