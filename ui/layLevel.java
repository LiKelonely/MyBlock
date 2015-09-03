package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015年8月22日 下午7:43:08 
 * @version 1.0 
 */
public class layLevel extends lay {
	private static Image IMG_LEVEL=new ImageIcon("graphics/string/level.png").getImage();
	

	private static final int IMG_LEVEL_W=IMG_LEVEL.getWidth(null);
	public layLevel(int x,int y,int width,int height){
		super(x,y,width,height);
	}
	public void paint(Graphics g){
		this.creatwindow(g);
		int x=this.width-IMG_LEVEL_W>>1;
		g.drawImage(IMG_LEVEL, this.x+x, this.y,null);
		this.drawNumber(32, 64, this.dto.getLevel(),2, g);
	}
	
}

