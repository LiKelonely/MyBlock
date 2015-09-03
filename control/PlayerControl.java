package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;


/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015年8月23日 上午11:30:02 
 * @version 1.0 
 */
public class PlayerControl extends KeyAdapter{

	private GameControl gameControl;
	
	
	public PlayerControl(GameControl gameControl){
		this.gameControl=gameControl;
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO 
		switch (arg0.getKeyCode()) {
		case KeyEvent.VK_UP:
			this.gameControl.keyup();
			this.gameControl.keylevel();
			break;
		case KeyEvent.VK_DOWN:
			this.gameControl.keydown();
			break;
		case KeyEvent.VK_LEFT:
			this.gameControl.keyleft();
			break;
		case KeyEvent.VK_RIGHT:
			this.gameControl.keyright();
			break;
		default:
			break;
		}
		
	}

	
}

