

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainHome implements ActionListener {
	JFrame f;
	private JButton[] b;
	JPanel p;
	boolean bh;
	int i1=0;
	int[] a=new int[1000];
	public void go() {
		f = new JFrame();
		p = new JPanel();
		b = new JButton[10];

		Professor pro=new Professor();
		
		a=pro.store_ans("a.txt");
	
		
		
		b[0] = new JButton(1 + "");
		b[1] = new JButton(2 + "");
		b[2] = new JButton(3 + "");
		b[3] = new JButton(4 + "");
		b[4] = new JButton(5 + "");
		b[5] = new JButton(6 + "");
		b[6] = new JButton(7 + "");
		b[7] = new JButton(8 + "");
		b[8] = new JButton(9 + "");
		b[9] = new JButton(10 + "");

		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

		for (int i = 1; i < 10; i++) {
			b[i].setEnabled(false);
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

	public void change_button_enable(int number, boolean key)
	{
		this.b[i1].setEnabled(key);//number
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource().equals(b[0])) {
			i1=1;
			 new Floor(a[0],a[1],a[2],"concept.txt", "p1.txt", "p2.txt", "p3.txt",this);
		}

		if (e.getSource().equals(b[1])) {
			i1=2;
			new Floor(a[3],a[4],a[5],"concept.txt", "p1.txt", "p2.txt", "p3.txt",this);
		}
		if (e.getSource().equals(b[2])) {
			i1=3;
			 new Floor(a[6],a[7],a[8],"concept.txt", "p1.txt", "p2.txt", "p3.txt",this);
		}
		if (e.getSource().equals(b[3])) {
			i1=4;
			 new Floor(a[9],a[10],a[11],"concept.txt", "p1.txt", "p2.txt", "p3.txt",this);
		}
		if (e.getSource().equals(b[4])) {
			i1=5;
			 new Floor(a[12],a[13],a[14],"concept.txt", "p1.txt", "p2.txt", "p3.txt",this);
		}
		if (e.getSource().equals(b[5])) {
			i1=6;
			 new Floor(a[15],a[16],a[17],"concept.txt", "p1.txt", "p2.txt", "p3.txt",this);
		}
		if (e.getSource().equals(b[6])) {
			i1=7;
			 new Floor(a[18],a[19],a[20],"concept.txt", "p1.txt", "p2.txt", "p3.txt",this);
		}
		if (e.getSource().equals(b[7])) {
			i1=8;
			 new Floor(a[21],a[22],a[23],"concept.txt", "p1.txt", "p2.txt", "p3.txt",this);
		}
		if (e.getSource().equals(b[8])) {
			i1=9;
			 new Floor(a[24],a[25],a[26],"concept.txt", "p1.txt", "p2.txt", "p3.txt",this);
		}
		if (e.getSource().equals(b[9])) {
			
			 new Floor(a[27],a[28],a[29],"concept.txt", "p1.txt", "p2.txt", "p3.txt",this);
		}
		

	}
	public static void main(String[] args) {
		new MainHome().go();
	}

}
