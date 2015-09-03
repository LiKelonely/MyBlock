package config;
/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015年8月22日 下午11:11:01 
 * @version 1.0 
 */
public class LayConfig {
	private String calssName;
	
	private int x;
	
	private int y;
	
	private int width;
	
	private int height;
	
	public LayConfig(String classname,int x,int y,int width,int height){
		this.calssName=classname;
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}

	public String getCalssName() {
		return calssName;
	}



	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public int getWidth() {
		return width;
	}


	public int getHeight() {
		return height;
	}


	
}

