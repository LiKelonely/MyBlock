package ui;

import java.awt.Graphics;
import java.awt.Image;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import service.GameService;
import config.ConfigFactory;
import config.GameConfig;
import config.LayConfig;
import control.GameControl;
import control.PlayerControl;
import dto.GameDto;

public class MyPanelGame extends JPanel{
	private List<lay> window_insight=null;
	private GameDto gamedto;
	
	public MyPanelGame (GameDto gamedto) {
		this.gamedto=gamedto;
		this.Initlay();
		
	
	}
	
	private void InitComponent(){
		GameControl ctrl = new GameControl(this,new GameService(gamedto));
		this.addKeyListener(new PlayerControl(ctrl));
	}
	
	
	private  void Initlay(){
		try {
			GameConfig cfg=ConfigFactory.getGameConfig();
			List<LayConfig> laycfg=cfg.getLaysconfig();
			window_insight=new ArrayList<lay>(laycfg.size());
			for(LayConfig laycfg_temp:laycfg){
				Class<?> c= Class.forName(laycfg_temp.getCalssName());
				Constructor ctor=c.getConstructor(int.class,int.class,int.class,int.class);
				lay l=(lay)ctor.newInstance(
						laycfg_temp.getX(),
						laycfg_temp.getY(),
						laycfg_temp.getWidth(),
						laycfg_temp.getHeight()
						);
				l.setDto(this.gamedto);
				window_insight.add(l);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Image e=new ImageIcon("graphics/background/bg_1.jpg").getImage();
		g.drawImage(e, 0, 0, 1162, 654, 0, 0, e.getWidth(null),e.getHeight(null), null);

        for(int i=0;i<window_insight.size();i++){
        	window_insight.get(i).paint(g);
        }
        this.requestFocus();
	}
	//安装玩家控制器
	public void setGameControl(PlayerControl control){
		this.addKeyListener(control);
	}
}
