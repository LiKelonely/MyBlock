package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015年8月22日 下午7:44:02 
 * @version 1.0 
 */
public class layPoint extends lay {
	private static Image IMG_POINT=new ImageIcon("graphics/string/score.png").getImage();
	private static Image IMG_DELETE=new ImageIcon("graphics/string/delete.png").getImage();
	
	
	
	public layPoint(int x,int y,int width,int height){
		super(x,y,width,height);
	}
	public void paint(Graphics g){
		this.creatwindow(g);
		g.drawImage(IMG_POINT, this.x+PADDING_START, this.y+PADDING_START,null);
		this.drawNumber(158, 28, this.dto.getNowPoint(),5, g);
		g.drawImage(IMG_DELETE, this.x+PADDING_START, this.y+PADDING_START*4,null);
		this.drawNumber(158, 76, this.dto.getNowRemoveline(),5, g);
		int rmLine=this.dto.getNowRemoveline();
		//this.drawRect((double)(rmLine%Level_UP),(double)Level_UP,g);
		this.drawRect("下一级","0",15,20,g);
		
	}

}

