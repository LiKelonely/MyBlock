package ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import config.ConfigFactory;
import config.GameConfig;

public class MyFrameGame extends JFrame{
	GameConfig cfg=ConfigFactory.getGameConfig();
	private  int FrameGame_h=cfg.getHeight();
	private  int FrameGame_w=cfg.getWidth();
	private  String title=cfg.getTitle();
	public MyFrameGame(MyPanelGame mypanelgame){
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(FrameGame_w, FrameGame_h);
		this.setResizable(false);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
		int screen_h=screen.height;
		int screen_w=screen.width;
		int x = (screen_w-FrameGame_w) >> 1;
		int y = (screen_h-FrameGame_h) >> 1 -32;
		
		this.setLocation(x, y);
		
		this.setContentPane(mypanelgame);
		this.setVisible(true);
	}
}
