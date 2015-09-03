package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import config.ConfigFactory;
import config.GameConfig;
import dto.GameDto;

public abstract class lay {
	private static  Image IMG=new ImageIcon("graphics/windows/windows3.png").getImage();
	private static GameConfig cfg=ConfigFactory.getGameConfig();
	protected static final int PADDING_START;
	protected static final int PADDING_END;
	private static final int SIZE;
	private static final int IMG_W;
	private static final int IMG_H;
	//Í¼Æ¬ 260*36
	private static final Image IMG_NUMBER= new ImageIcon("graphics/string/num.png").getImage();
	private static Image IMG_RECT=new ImageIcon("graphics/windows/rect.png").getImage();
	private static final int IMG_NUMBER_W=26;
	private static final int IMG_NUMBER_H=36;
	
	private final int expW;
	private final int IMG_RECT_W=IMG_RECT.getWidth(null);
	private final int IMG_RECT_H=IMG_RECT.getHeight(null);
	private static final int Level_UP=20;
	private static final Font DEF_FONT=new Font("ºÚÌå",Font.BOLD,20);
	
	static{
		PADDING_START=cfg.getPADDING_START();
		PADDING_END=cfg.getPADDING_END();
		SIZE=cfg.getSIZE();
		IMG_W=IMG.getWidth(null);
		IMG_H=IMG.getHeight(null);
		
	}
//	¾àÀë×ÀÃæ×ó±ßµÄ¾àÀë
	protected int x;
//	¾àÀë×ÀÃæÉÏ±ßµÄ¾àÀë
	protected int y;
//	Ëù»­¿òÌåµÄ¿í
	protected int width;
//	Ëù»­¿òÌåµÄ¸ß
	protected int height;
	
	protected GameDto dto;
	
	public void setDto(GameDto dto) {
		this.dto = dto;
	}

	protected lay(int x,int y,int width,int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		expW=this.width-2*PADDING_START;
	}
	
	protected void creatwindow(Graphics g){
		g.drawImage(IMG, x , y,x+SIZE,y+SIZE,0,0,SIZE,SIZE,null);
		g.drawImage(IMG, x+SIZE, y, width+x-SIZE, y+SIZE, SIZE, 0, IMG_W-SIZE, SIZE, null);
		g.drawImage(IMG, width+x-SIZE, y, x+width, y+SIZE, IMG_W-SIZE, 0, IMG_W, SIZE, null);
		g.drawImage(IMG, width+x-SIZE, y+SIZE, x+width, y+height-SIZE, IMG_W-SIZE, SIZE, IMG_W, IMG_H-SIZE, null);
		g.drawImage(IMG, width+x-SIZE, y+height-SIZE, x+width, y+height, IMG_W-SIZE, IMG_H-SIZE,IMG_W, IMG_H, null);
		g.drawImage(IMG, x+SIZE, y+height-SIZE, x+width-SIZE, y+height, SIZE, IMG_H-SIZE,IMG_W-SIZE, IMG_H, null);
		g.drawImage(IMG, x, y+height-SIZE, x+SIZE, y+height, 0, IMG_H-SIZE, SIZE, IMG_H, null);
		g.drawImage(IMG, x, y+SIZE, x+SIZE, y+height-SIZE, 0, SIZE, SIZE, IMG_H-SIZE, null);
		g.drawImage(IMG, x+SIZE,y+SIZE,width+x-SIZE, y+height-SIZE, SIZE, SIZE, IMG_W-SIZE, IMG_H-SIZE, null);
	}
	abstract public void paint(Graphics g);
	
	protected void drawNumber(int x,int y,int num ,int maxBit,Graphics g){
		/*int length=0;
		int num_temp=num;
		while(0!=num_temp){
			length++;
			num_temp/=10;
		}
		for(int i=length;i>0;i--){
			num_temp=num%10;
			num/=10;
			g.drawImage(IMG_NUMBER, this.x+x+i*IMG_NUMBER_W,this.y+y, this.x+x+(i+1)*IMG_NUMBER_W, this.y+y+IMG_NUMBER_H, num_temp*IMG_NUMBER_W, 0, (num_temp+1)*IMG_NUMBER_W, IMG_NUMBER_H, null);
		}*/
		
		String strNum = Integer.toString(num);
		for (int i = 0; i < maxBit; i++) {
			if(maxBit-i<=strNum.length()){
				int idx=i-maxBit+strNum.length();
				int bit = strNum.charAt(idx)-'0';
				g.drawImage(IMG_NUMBER, 
					this.x+x+i*IMG_NUMBER_W,this.y+y, 
					this.x+x+(i+1)*IMG_NUMBER_W, this.y+y+IMG_NUMBER_H, 
					bit*IMG_NUMBER_W, 0,(bit+1)*IMG_NUMBER_W, IMG_NUMBER_H,
					null);
			}
		}
		
		
	}
	protected void drawRect(String title, String num,double value,double maxvalue ,Graphics g){
		g.setColor(Color.black);
		g.fillRect(this.x+PADDING_START,this.y+128, expW, 32);
		g.setColor(Color.WHITE);
		g.fillRect(this.x+PADDING_START+1,this.y+128+1, expW-2, 32-2);
		g.setColor(Color.black);
		g.fillRect(this.x+PADDING_START+2,this.y+128+2, expW-4, 32-4);
		g.setColor(Color.GREEN);
		//ÁÙÊ±
		
		int w=25;//²âÊÔÓÃÀý
		//int w = (int)((value/maxvalue)*(expW-4));
		double p=value/maxvalue;
		
		int subIdx=(int)(p*IMG_RECT_W);
		
		//g.fillRect(this.x+PADDING_START+2,this.y+128+2,w, 32-4);
		g.drawImage(IMG_RECT, this.x+PADDING_START+2, this.y+128+2, 
				this.x+PADDING_START+2+w, this.y+128+2+32-4, 
				subIdx, 0, 
				subIdx+1, IMG_RECT_H, 
				null);
		g.setColor(Color.WHITE);
		g.setFont( DEF_FONT);
		g.drawString(title, this.x+PADDING_START+2, this.y+128+23);
	}
}
