package control;

import service.GameService;
import ui.MyPanelGame;

/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015年8月23日 下午6:49:30 
 * @version 1.0 
 * 接收玩家控制
 * 控制画面
 * 控制游戏逻辑
 */
public class GameControl {
	private  MyPanelGame mypanelganme;
	private  GameService gameservice;
	public GameControl(MyPanelGame mypanelgame,GameService gameservice){
		this.mypanelganme=mypanelgame;
		this.gameservice=gameservice;
	}
	public void keyup() {
		// TODO Auto-generated method stub
		this.gameservice.keyup();
		this.mypanelganme.repaint();
	}
	public void keydown() {
		// TODO Auto-generated method stub
		this.gameservice.keydown();
		this.mypanelganme.repaint();
	}
	public void keyleft() {
		// TODO Auto-generated method stub
		this.gameservice.keyleft();
		this.mypanelganme.repaint();
	}
	public void keyright() {
		// TODO Auto-generated method stub
		this.gameservice.keyright();
		this.mypanelganme.repaint();
	}
	
	
	//TODO======================测试专用=======================
	public void keylevel() {
		// TODO Auto-generated method stub
		this.gameservice.keylevel();
		this.mypanelganme.repaint();
	}
}

