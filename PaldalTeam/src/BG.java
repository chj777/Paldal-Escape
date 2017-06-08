import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BG extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BG frame = new BG();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c=(CardLayout)(contentPane.getLayout());
				c.show(contentPane, "t1");
			}
		});
		menuBar.add(btnStart);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout)(contentPane.getLayout());
				c.show(contentPane, "t2");
			}
		});
		menuBar.add(btnMenu);
		
		JButton btnRed = new JButton("Red");
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout)(contentPane.getLayout());
				c.show(contentPane, "t3");
			}
		});
		menuBar.add(btnRed);
		
		JButton btnGreen = new JButton("Green");
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout)(contentPane.getLayout());
				c.show(contentPane, "t4");
			}
		});
		menuBar.add(btnGreen);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.PINK);
		contentPane.add(p1, "t1");
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.BLUE);
		contentPane.add(p2, "t2");
		
		JPanel p3 = new JPanel();
		p3.setBackground(Color.RED);
		contentPane.add(p3, "t3");
		
		JPanel p4 = new JPanel();
		p4.setBackground(Color.GREEN);
		contentPane.add(p4, "t4");
	}
}
