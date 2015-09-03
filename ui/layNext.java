package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015年8月22日 下午7:42:25 
 * @version 1.0 
 */
public class layNext extends lay {
	
	private static  Image[] NEXT_ACT;
		
	static{
		NEXT_ACT=new Image[7];
		for (int i = 0; i < NEXT_ACT.length; i++) {
			NEXT_ACT[i]=new ImageIcon("graphics/game/"+i+".png").getImage();
		}
	}
	
	public layNext(int x,int y,int width,int height){
		super(x,y,width,height);
	}
	public void paint(Graphics g){
		this.creatwindow(g);
		this.drawImageOfCenter(g, NEXT_ACT[this.dto.getNext()]);
	}
	
	
	private void drawImageOfCenter(Graphics g,Image img){
		int imgW=img.getWidth(null);
		int imgH=img.getHeight(null);
		int imgX=this.width-imgW>>1;
		int imgY=this.height-imgH>>1;
		g.drawImage(img, this.x+imgX, this.y+imgY,null);
		
	}
}

