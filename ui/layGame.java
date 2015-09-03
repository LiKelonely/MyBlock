package ui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015年8月22日 下午7:40:06 
 * @version 1.0 
 */
public class layGame extends lay {
	private Image e=new ImageIcon("graphics/game/rect.png").getImage();
	
	private static int ACT_SIZE_ROL=5;
	
	public layGame(int x,int y,int width,int height){
		super(x,y,width,height);
	}
	public void paint(Graphics g){
		this.creatwindow(g);
		Point[] points=this.dto.getGameAct().getActPoint();
		int typecode=this.dto.getGameAct().getTypecode();
		for(int i = 0;i< points.length;i++){
			
			drawActByPoint(points[i].x,points[i].y,typecode,g);
		}
		
		boolean[][] map=this.dto.getGameMap();
		for (int x = 0; x < map.length; x++) {
			for (int y = 0; y < map[x].length; y++) {
				if(map[x][y]){
					drawActByPoint(x,y,8,g);
				}
				
			}
		}
		
	}
	private void drawActByPoint(int x,int y,int Imgindex,Graphics g){
		g.drawImage(e, 
				this.x+(x<<ACT_SIZE_ROL)+7,
				this.y+(y<<ACT_SIZE_ROL)+7, 
				this.x+((x+1)<<ACT_SIZE_ROL)+7,
				this.y+((y+1)<<ACT_SIZE_ROL)+7, 
				Imgindex<<ACT_SIZE_ROL, 0, (Imgindex+1)<<ACT_SIZE_ROL, 32, null);
	}
}

