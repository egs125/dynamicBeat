package hitTheNotes;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Button /*extends JButton*/{

	public Button() {}
	/*private ImageIcon btnBasicImg;
	private ImageIcon btnEnteredImg;
	private JButton btn;
	
	public Button(String btnNm) {
		
		btnBasicImg = new ImageIcon(Main.class.getResource("../images/" + btnNm + "Basic.png"));
		btnEnteredImg = new ImageIcon(Main.class.getResource("../images/" + btnNm + "Entered.png"));
		btn = new JButton(btnBasicImg);
		
		btn.setBorderPainted(false);
		btn.setContentAreaFilled(false);
		btn.setFocusPainted(false);
		btn.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setIcon(btnEnteredImg);
				btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music btnEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
				btnEnteredMusic.start();
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btn.setIcon(btnBasicImg);
				btn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				Music btnEnteredMusic = new Music("buttonPressedMusic.mp3", false);
				btnEnteredMusic.start();
				if ( btnNm.equals("exitButton")) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
					System.exit(0);
				}
			}
		});
	}*/
	
}
