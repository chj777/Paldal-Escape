
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

public class Learning extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnGotoquestionbox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Learning frame = new Learning();
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
	public Learning() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblFloor = new JLabel("FLOOR 2");
		
		textField = new JTextField();
		textField.setText("\u3147\uC5EC\uC5ED\uC5EC\uAE30\uAE45\uAE30\uC5D0\uC5D4\uC5D0\uB290\uB294\uB294 \u3145\uC11C\uC124\uC126\uC124\uBA70\uBA85\uBA85\u3147\uC774\uC774 \u3137\uB4DC\uB4E4\uB4E4\u3147\uC5B4\uC5B5\uC5B4\uAC00\uAC08\uAC09\uAC08\uAC70\uAC81\uAC81\u3134\uB2C8\uB2CF\uB2C8\uB2E4\uB2E4.");
		textField.setColumns(10);
		
		btnGotoquestionbox = new JButton("GotoQuestionBox");
		btnGotoquestionbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				question q = new question();
				q.setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
						.addComponent(lblFloor)
						.addComponent(btnGotoquestionbox, Alignment.TRAILING))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblFloor)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
					.addComponent(btnGotoquestionbox)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}