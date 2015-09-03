package control;

import service.GameService;
import ui.MyPanelGame;

/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015��8��23�� ����6:49:30 
 * @version 1.0 
 * ������ҿ���
 * ���ƻ���
 * ������Ϸ�߼�
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
	
	
	//TODO======================����ר��=======================
	public void keylevel() {
		// TODO Auto-generated method stub
		this.gameservice.keylevel();
		this.mypanelganme.repaint();
	}
}

