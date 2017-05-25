
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class question extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					question frame = new question();
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
	public question() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JCheckBox chckbxAnswer = new JCheckBox("Answer1");
		
		JCheckBox chckbxAnswer_1 = new JCheckBox("Answer2");
		
		JCheckBox chckbxAnswer_2 = new JCheckBox("Answer3");
		
		JCheckBox chckbxAnswer_3 = new JCheckBox("Answer4");
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAnswer.isSelected()){
					JOptionPane.showMessageDialog(null, "Success! 다음 층으로 넘어갈까요?");
					Learning2 b = new Learning2();
					b.setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(null, "Wrong!");
					Learning a = new Learning();
					a.setVisible(true);
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxAnswer_1)
								.addComponent(chckbxAnswer)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxAnswer_2)
										.addComponent(chckbxAnswer_3))
									.addPreferredGap(ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
									.addComponent(btnSubmit)))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(chckbxAnswer)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxAnswer_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxAnswer_2)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(chckbxAnswer_3))
						.addComponent(btnSubmit))
					.addContainerGap())
		);
		
		JTextArea txtrQWhatIs = new JTextArea();
		txtrQWhatIs.setText("Q1. What is her name?");
		panel.add(txtrQWhatIs);
		contentPane.setLayout(gl_contentPane);
	}
}