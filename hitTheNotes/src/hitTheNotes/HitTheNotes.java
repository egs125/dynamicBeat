package hitTheNotes;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class HitTheNotes extends JFrame {

	//더블 버퍼링을 위해 전체 이미지를 담는 인스턴스
		private Image screenImage;
		private Graphics screenGraphic;
		
		//인트로 백그라운드를 담는 인스턴스
		private Image introBackground;
		
		public HitTheNotes() {
			setTitle("Dynamic Beat");
			setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
			setResizable(false);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			//메인 클래스 위치를 기반으로 해서 이미지 변수에 jpg 이미지를 담아줌
			introBackground = new ImageIcon(Main.class.getResource("../images/intro.jpg")).getImage();
		}
		
		public void paint(Graphics g) {
			screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); //스크린 높이, 길이를 기반으로 스크린 이미지를 생성
			screenGraphic = screenImage.getGraphics(); //만들어진 스크린이미지를 이용해 그래픽 객체를 얻어옴
			screenDraw(screenGraphic);
			g.drawImage(screenImage, 0, 0, null);
		}
		
		public void screenDraw(Graphics g) {
			g.drawImage(introBackground, 0, 0, null);
			this.repaint(); 
		}
}
