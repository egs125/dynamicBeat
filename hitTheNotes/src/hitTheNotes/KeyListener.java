package hitTheNotes;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter{

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(HitTheNotes.game == null) {
			return;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_S) {
			HitTheNotes.game.pressS();
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			HitTheNotes.game.pressD();
		}
		else if(e.getKeyCode() == KeyEvent.VK_F) {
			HitTheNotes.game.pressF();
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			HitTheNotes.game.pressSpace();
		}
		else if(e.getKeyCode() == KeyEvent.VK_J) {
			HitTheNotes.game.pressJ();
		}
		else if(e.getKeyCode() == KeyEvent.VK_K) {
			HitTheNotes.game.pressK();
		}
		else if(e.getKeyCode() == KeyEvent.VK_L) {
			HitTheNotes.game.pressL();
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		if(HitTheNotes.game == null) {
			return;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_S) {
			HitTheNotes.game.releaseS();
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			HitTheNotes.game.releaseD();
		}
		else if(e.getKeyCode() == KeyEvent.VK_F) {
			HitTheNotes.game.releaseF();
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			HitTheNotes.game.releaseSpace();
		}
		else if(e.getKeyCode() == KeyEvent.VK_J) {
			HitTheNotes.game.releaseJ();
		}
		else if(e.getKeyCode() == KeyEvent.VK_K) {
			HitTheNotes.game.releaseK();
		}
		else if(e.getKeyCode() == KeyEvent.VK_L) {
			HitTheNotes.game.releaseL(); 
		}
	}
}
