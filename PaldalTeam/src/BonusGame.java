import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.JCheckBox;

public class BonusGame extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BonusGame frame = new BonusGame();
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
	public BonusGame() {
		double randomValue = Math.random();
		int intValue = (int)(randomValue*3)+1;
		int page = (int)(randomValue*2)+3;
		String hand;
		
		if(intValue == 1){
			hand = "Rock";
		}
		else if(intValue == 2){
			hand = "Scissor";
		}
		else{
			hand = "Paper";
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(255, 255, 255));
		contentPane.add(p1, "name_608063342298161");
		
		JButton btnOk = new JButton("START");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c = (CardLayout)(contentPane.getLayout());
				c.show(contentPane, "t2");
			}
		});
		
		JLabel lblMiniGame = new JLabel("MINI GAME");
		lblMiniGame.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		
		JLabel lblYouAreGoing = new JLabel("You are going to play 'ROCK, SCISSOR, PAPER' games with me.");
		
		JLabel lblIfYouWin = new JLabel("If you win, you are going to get easy questions.");
		
		JLabel lblIfYouLose = new JLabel("If you lose, you are going to get hard questions.");
		
		JLabel lblIfYouDraw = new JLabel("If you draw, you are going to get random questions.");
		
		JLabel lblWhenYouWin = new JLabel("When you win, you'll finally escape!");
		
		JLabel lblWhenYouLose = new JLabel("When you lose, you have to solve another questions.");
		
		JLabel lblSoGoodLuck = new JLabel("So, good luck!");
		GroupLayout gl_p1 = new GroupLayout(p1);
		gl_p1.setHorizontalGroup(
			gl_p1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_p1.createSequentialGroup()
					.addContainerGap(240, Short.MAX_VALUE)
					.addComponent(lblMiniGame)
					.addGap(252))
				.addGroup(Alignment.LEADING, gl_p1.createSequentialGroup()
					.addGap(240)
					.addComponent(btnOk, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
					.addGap(252))
				.addGroup(Alignment.LEADING, gl_p1.createSequentialGroup()
					.addGap(79)
					.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSoGoodLuck)
						.addComponent(lblWhenYouLose)
						.addComponent(lblWhenYouWin)
						.addComponent(lblIfYouWin)
						.addComponent(lblYouAreGoing)
						.addComponent(lblIfYouDraw)
						.addComponent(lblIfYouLose))
					.addContainerGap(83, Short.MAX_VALUE))
		);
		gl_p1.setVerticalGroup(
			gl_p1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p1.createSequentialGroup()
					.addGap(41)
					.addComponent(lblMiniGame)
					.addGap(27)
					.addComponent(lblYouAreGoing)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblIfYouWin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblIfYouLose)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblIfYouDraw)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblWhenYouWin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblWhenYouLose)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSoGoodLuck)
					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
					.addComponent(btnOk)
					.addGap(32))
		);
		p1.setLayout(gl_p1);
		
		JPanel p2 = new JPanel();
		p2.setForeground(new Color(255, 255, 255));
		p2.setBackground(new Color(255, 255, 255));
		contentPane.add(p2, "t2");
		
		JLabel lblRound = new JLabel("ROUND 1.");
		lblRound.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 20));
		
		JRadioButton rdbtnRock = new JRadioButton("Rock");
		rdbtnRock.setBackground(new Color(255, 255, 255));
		buttonGroup.add(rdbtnRock);
		
		JRadioButton rdbtnScissor = new JRadioButton("Scissor");
		rdbtnScissor.setBackground(new Color(255, 255, 255));
		buttonGroup.add(rdbtnScissor);
		
		JRadioButton rdbtnPaper = new JRadioButton("Paper");
		rdbtnPaper.setBackground(new Color(255, 255, 255));
		buttonGroup.add(rdbtnPaper);
		
		JButton btnOk_1 = new JButton("\r\n\r\n\r\n\r\nConfirm\r\n");
		btnOk_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String rand = "t" + page;
				
				if(rdbtnRock.isSelected()){
					if(intValue == 1){
						//ÀÌ±è
						JOptionPane.showMessageDialog(null, "Computer: Scissor \n You win! \n You will get easy questions!");
						CardLayout c=(CardLayout)(contentPane.getLayout());
						c.show(contentPane, "t4");
					}
					else if(intValue == 2){
						//¹«½ÂºÎ
						JOptionPane.showMessageDialog(null, "Computer: Scissor \n You draw! \n You will get random questions!");
						CardLayout c=(CardLayout)(contentPane.getLayout());
						c.show(contentPane, rand);
					}
					else{
						//Áü
						JOptionPane.showMessageDialog(null, "Computer: Paper \n You lose! \n You will get hard questions!");
						CardLayout c=(CardLayout)(contentPane.getLayout());
						c.show(contentPane, "t3");
					}
				}
				else if(rdbtnScissor.isSelected()){
					if(intValue == 1){
						//¹«½ÂºÎ
						JOptionPane.showMessageDialog(null, "Computer: Scissor \n You draw! \n You will get random questions!");
						CardLayout c=(CardLayout)(contentPane.getLayout());
						c.show(contentPane, rand);
					}
					else if(intValue == 2){
						//Áü
						JOptionPane.showMessageDialog(null, "Computer: Rock \n You lose! \n You will get hard questions!");
						CardLayout c=(CardLayout)(contentPane.getLayout());
						c.show(contentPane, "t3");
					}
					else{
						//ÀÌ±è
						JOptionPane.showMessageDialog(null, "Computer: Paper \n You win! \n You will get easy questions!");
						CardLayout c=(CardLayout)(contentPane.getLayout());
						c.show(contentPane, "t4");
					}
				}
				else if(rdbtnPaper.isSelected()){
					if(intValue == 1){
						//Áü
						JOptionPane.showMessageDialog(null, "Computer: Scissor \n You lose! \n You will get hard questions!");
						CardLayout c=(CardLayout)(contentPane.getLayout());
						c.show(contentPane, "t3");
					}
					else if(intValue == 2){
						//ÀÌ±è
						JOptionPane.showMessageDialog(null, "Computer: Rock \n You win! \n You will get easy questions!");
						CardLayout c=(CardLayout)(contentPane.getLayout());
						c.show(contentPane, "t4");
					}
					else{
						//¹«½ÂºÎ
						JOptionPane.showMessageDialog(null, "Computer: Scissor \n You draw! \n You will get random questions!");
						CardLayout c=(CardLayout)(contentPane.getLayout());
						c.show(contentPane, rand);
					}

				}
				else{
					JOptionPane.showMessageDialog(null, "Please select!");
				}
				
			}
		});
		btnOk_1.setForeground(new Color(0, 0, 0));
		btnOk_1.setBackground(new Color(204, 204, 204));
		GroupLayout gl_p2 = new GroupLayout(p2);
		gl_p2.setHorizontalGroup(
			gl_p2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p2.createSequentialGroup()
					.addGap(51)
					.addComponent(rdbtnRock)
					.addGap(132)
					.addGroup(gl_p2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p2.createSequentialGroup()
							.addComponent(rdbtnScissor)
							.addPreferredGap(ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
							.addComponent(rdbtnPaper)
							.addGap(83))
						.addGroup(gl_p2.createSequentialGroup()
							.addGroup(gl_p2.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnOk_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblRound, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addContainerGap(258, Short.MAX_VALUE))))
		);
		gl_p2.setVerticalGroup(
			gl_p2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p2.createSequentialGroup()
					.addGap(62)
					.addComponent(lblRound)
					.addGap(144)
					.addGroup(gl_p2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnRock)
						.addComponent(rdbtnScissor)
						.addComponent(rdbtnPaper))
					.addGap(36)
					.addComponent(btnOk_1)
					.addContainerGap(43, Short.MAX_VALUE))
		);
		p2.setLayout(gl_p2);
		
		JPanel p3 = new JPanel();
		p3.setBackground(new Color(255, 255, 255));
		contentPane.add(p3, "t3");
		
		JLabel lblHardQuestion = new JLabel("\uC5B4\uB824\uC6B4 \uBB38\uC81C\uAC00 \uC774 \uACF3\uC5D0 \uAC8C\uC2DC\uB420 \uC608\uC815\uC785\uB2C8\uB2E4.");
		
		JCheckBox checkBox = new JCheckBox("\uB0B4\uAC00 \uB2F5\uC774\uB2E4");
		checkBox.setBackground(new Color(255, 255, 255));
		buttonGroup.add(checkBox);
		
		JCheckBox chckbxNo = new JCheckBox("no1");
		chckbxNo.setBackground(new Color(255, 255, 255));
		buttonGroup.add(chckbxNo);
		
		JCheckBox chckbxNo_1 = new JCheckBox("no2");
		chckbxNo_1.setBackground(new Color(255, 255, 255));
		buttonGroup.add(chckbxNo_1);
		
		JCheckBox chckbxNo_2 = new JCheckBox("no3");
		chckbxNo_2.setBackground(new Color(255, 255, 255));
		buttonGroup.add(chckbxNo_2);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkBox.isSelected()){
					JOptionPane.showMessageDialog(null, "Correct!");
					CardLayout c=(CardLayout)(contentPane.getLayout());
					c.show(contentPane, "t5");
				}
				else{
					/////////////////Á³À» ¶§!! ±× 1ÃþºÎÅÍ 10Ãþ±îÁö ³ª¿Í¾ßÇÏ´Â°÷
					JOptionPane.showMessageDialog(null, "Wrong!");
					System.exit(0);
				}
			}
		});
		GroupLayout gl_p3 = new GroupLayout(p3);
		gl_p3.setHorizontalGroup(
			gl_p3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_p3.createSequentialGroup()
					.addGroup(gl_p3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p3.createSequentialGroup()
							.addGap(43)
							.addGroup(gl_p3.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNo_2)
								.addComponent(checkBox)
								.addComponent(chckbxNo)
								.addComponent(chckbxNo_1)))
						.addGroup(gl_p3.createSequentialGroup()
							.addGap(163)
							.addComponent(lblHardQuestion)))
					.addContainerGap(167, Short.MAX_VALUE))
				.addGroup(gl_p3.createSequentialGroup()
					.addContainerGap(262, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addGap(259))
		);
		gl_p3.setVerticalGroup(
			gl_p3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p3.createSequentialGroup()
					.addGap(87)
					.addComponent(lblHardQuestion)
					.addGap(76)
					.addComponent(checkBox)
					.addGap(2)
					.addComponent(chckbxNo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNo_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNo_2)
					.addGap(8)
					.addComponent(btnSubmit)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		p3.setLayout(gl_p3);
		/// ´Ï³Ä´Ï´¢
		JPanel p4 = new JPanel();
		p4.setBackground(new Color(255, 255, 255));
		contentPane.add(p4, "t4");
		
		JLabel label = new JLabel("\uC26C\uC6B4 \uBB38\uC81C\uAC00 \uC774\uACF3\uC5D0 \uAC8C\uC2DC\uB420 \uC608\uC815\uC785\uB2C8\uB2E4.\r\n\r\n\uD558\uD558");
		
		JCheckBox chckbxNo_3 = new JCheckBox("no1");
		chckbxNo_3.setBackground(new Color(255, 255, 255));
		buttonGroup.add(chckbxNo_3);
		
		JCheckBox chckbxNo_4 = new JCheckBox("no2");
		chckbxNo_4.setBackground(new Color(255, 255, 255));
		buttonGroup.add(chckbxNo_4);
		
		JCheckBox chckbxIamtheanswer = new JCheckBox("Iamtheanswer");
		chckbxIamtheanswer.setBackground(new Color(255, 255, 255));
		buttonGroup.add(chckbxIamtheanswer);
		
		JCheckBox chckbxNo_5 = new JCheckBox("no3");
		chckbxNo_5.setBackground(new Color(255, 255, 255));
		buttonGroup.add(chckbxNo_5);
		
		JButton btnSubmit_1 = new JButton("Submit");
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				////////////////////////////////////////// 3¹øÀÌ°¡ ´ä
				if(chckbxIamtheanswer.isSelected()){
					JOptionPane.showMessageDialog(null, "Correct!");
					CardLayout c=(CardLayout)(contentPane.getLayout());
					c.show(contentPane, "t5");
					
				}
				else{
					/////////////////Á³À» ¶§!! 1ÃþºÎÅÍ 10Ãþ±îÁö ³ª¿À´Â Ã¢ÀÌ ¶°¾ß ÇÔ...
					
					JOptionPane.showMessageDialog(null, "Wrong!");
					System.exit(0);
				}
				
			}
		});
		GroupLayout gl_p4 = new GroupLayout(p4);
		gl_p4.setHorizontalGroup(
			gl_p4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p4.createSequentialGroup()
					.addGroup(gl_p4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p4.createSequentialGroup()
							.addGap(154)
							.addComponent(label))
						.addGroup(gl_p4.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_p4.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNo_3)
								.addComponent(chckbxNo_4)
								.addComponent(chckbxIamtheanswer)
								.addComponent(chckbxNo_5))))
					.addContainerGap(167, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_p4.createSequentialGroup()
					.addContainerGap(267, Short.MAX_VALUE)
					.addComponent(btnSubmit_1)
					.addGap(254))
		);
		gl_p4.setVerticalGroup(
			gl_p4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p4.createSequentialGroup()
					.addGap(89)
					.addComponent(label)
					.addGap(55)
					.addComponent(chckbxNo_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNo_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxIamtheanswer)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNo_5)
					.addGap(18)
					.addComponent(btnSubmit_1)
					.addContainerGap(51, Short.MAX_VALUE))
		);
		p4.setLayout(gl_p4);
		
		JPanel p5 = new JPanel();
		contentPane.add(p5, "t5");
		
		JLabel label_1 = new JLabel("\uC774\uACA8\uC11C \uD0C8\uCD9C\uD588\uC744 \uB54C \uB098\uC624\uB294 \uD398\uC774\uC9C0\uC784");
		GroupLayout gl_p5 = new GroupLayout(p5);
		gl_p5.setHorizontalGroup(
			gl_p5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p5.createSequentialGroup()
					.addGap(169)
					.addComponent(label_1)
					.addContainerGap(199, Short.MAX_VALUE))
		);
		gl_p5.setVerticalGroup(
			gl_p5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p5.createSequentialGroup()
					.addGap(159)
					.addComponent(label_1)
					.addContainerGap(189, Short.MAX_VALUE))
		);
		p5.setLayout(gl_p5);
	}
}
