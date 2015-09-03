package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015年8月22日 下午7:35:30 
 * @version 1.0 
 */
public class layDatebase extends lay{
	
	private static Image IMG_DB=new ImageIcon("graphics/string/db.png").getImage();
	
	public layDatebase(int x,int y,int width,int height){
		super(x,y,width,height);
	}
	public void paint(Graphics g){
		this.creatwindow(g);
		g.drawImage(IMG_DB, this.x+PADDING_START, this.y+PADDING_START, this.x+PADDING_END*2,this.y+PADDING_END,0,0,IMG_DB.getWidth(null),IMG_DB.getHeight(null),null);
	}
	
}

