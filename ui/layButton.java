package ui;

import java.awt.Graphics;

/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015年8月22日 下午7:41:33 
 * @version 1.0 
 */
public class layButton extends lay {
	public layButton(int x,int y,int width,int height){
		super(x,y,width,height);
	}
	public void paint(Graphics g){
		this.creatwindow(g);
	}
}

