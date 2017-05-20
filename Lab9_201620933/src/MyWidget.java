import java.awt.*;
import javax.swing.*;

public class MyWidget extends JPanel {

	
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.ORANGE);
		g.fillRect(150, 150, 100, 100);
		
		g.setColor(Color.RED);
		g.drawLine(150, 70, 300, 150);
		
		g.setColor(Color.BLUE);
		g.drawOval(300, 20, 400, 100);
		
		Image image = new ImageIcon("79749_S12_140822.jpg").getImage();
		g.drawImage(image, 300, 300, null);
		
		g.setColor(Color.PINK);
		Font font = new Font("Time New Roman", Font.BOLD, 20);
		g.setFont(font);
		g.drawString("Go back!", 450, 200);
		
		g.setColor(Color.DARK_GRAY);
		int[] xArr = new int[]{150, 150, 50, 50, 30};
		int[] yArr = new int[]{150, 150, 50, 50, 70};
		g.drawPolygon(xArr, yArr, 5);
	}
	
}
