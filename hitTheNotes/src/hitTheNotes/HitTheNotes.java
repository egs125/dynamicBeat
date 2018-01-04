package hitTheNotes;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class HitTheNotes extends JFrame {

	//���� ���۸��� ���� ��ü �̹����� ��� �ν��Ͻ�
		private Image screenImage;
		private Graphics screenGraphic;
		
		//��Ʈ�� ��׶��带 ��� �ν��Ͻ�
		private Image introBackground;
		
		public HitTheNotes() {
			setTitle("Dynamic Beat");
			setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
			setResizable(false);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			//���� Ŭ���� ��ġ�� ������� �ؼ� �̹��� ������ jpg �̹����� �����
			introBackground = new ImageIcon(Main.class.getResource("../images/intro.jpg")).getImage();
		}
		
		public void paint(Graphics g) {
			screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); //��ũ�� ����, ���̸� ������� ��ũ�� �̹����� ����
			screenGraphic = screenImage.getGraphics(); //������� ��ũ���̹����� �̿��� �׷��� ��ü�� ����
			screenDraw(screenGraphic);
			g.drawImage(screenImage, 0, 0, null);
		}
		
		public void screenDraw(Graphics g) {
			g.drawImage(introBackground, 0, 0, null);
			this.repaint(); 
		}
}
