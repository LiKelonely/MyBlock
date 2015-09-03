package entity;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015年8月23日 下午7:25:02 
 * @version 1.0 
 */
public class GameAct {
	private Point[] actPoints;
	
	private static int MIN_X=0;
	private static int MAX_X=9;
	private static int MIN_Y=0;
	private static int MAX_Y=17;
	
	private int typecode;

	private static List<Point[]> ACT_TYPE_CONFIG;
	
	static{
		ACT_TYPE_CONFIG = new ArrayList<Point[]>(7);
		ACT_TYPE_CONFIG.add(new Point[]{new Point(4,0),
				new Point(3,0),
				new Point(5,0),
				new Point(6,0)});
		ACT_TYPE_CONFIG.add(new Point[]{new Point(4,0),
				new Point(3,0),
				new Point(5,0),
				new Point(4,1)});
		ACT_TYPE_CONFIG.add(new Point[]{new Point(4,0),
				new Point(3,0),
				new Point(5,0),
				new Point(3,1)});
		ACT_TYPE_CONFIG.add(new Point[]{new Point(4,0),
				new Point(3,1),
				new Point(4,1),
				new Point(5,0)});
		ACT_TYPE_CONFIG.add(new Point[]{new Point(4,0),
				new Point(4,1),
				new Point(5,0),
				new Point(5,1)});
		ACT_TYPE_CONFIG.add(new Point[]{new Point(4,0),
				new Point(3,0),
				new Point(5,0),
				new Point(5,1)});
		ACT_TYPE_CONFIG.add(new Point[]{new Point(4,0),
				new Point(3,0),
				new Point(4,1),
				new Point(5,1)});
	}
	public GameAct() {
		this.init(new Random().nextInt(7));
	}

	public Point[] getActPoint() {
		return actPoints;
	}
	public boolean move(int moveX,int moveY,boolean[][] gamemap){
		for (int i = 0; i < actPoints.length; i++) {
			int newX=actPoints[i].x+moveX;
			int newY=actPoints[i].y+moveY;
			if(this.isovermap(newX, newY,gamemap)){
				return false;
			}
		}
		for (int i = 0; i < actPoints.length; i++) {
			actPoints[i].x+=moveX;
			actPoints[i].y+=moveY;
		}
		return true;
	}
	public void round(boolean[][] gamemap){
		if(this.typecode==4)return;
		for (int i = 1; i < actPoints.length; i++) {
			int newX=actPoints[0].y+actPoints[0].x-actPoints[i].y;
			int newY=actPoints[0].y-actPoints[0].x+actPoints[i].x;
			
			if(this.isovermap(newX, newY,gamemap)){
				return;
			}
		}
		for (int i = 0; i < actPoints.length; i++) {
			int newX=actPoints[0].y+actPoints[0].x-actPoints[i].y;
			int newY=actPoints[0].y-actPoints[0].x+actPoints[i].x;
			actPoints[i].x=newX;
			actPoints[i].y=newY;
		}
	}
	private boolean isovermap(int newX,int newY,boolean[][] gamemap){
		return  newX<MIN_X||newX>MAX_X||newY<MIN_Y||newY>MAX_Y||gamemap[newX][newY];
		}

	public void init(int actCode) {
		this.typecode=actCode;
		Point[] points =ACT_TYPE_CONFIG.get(actCode);
		actPoints=new Point[points.length];
		for (int i = 0; i < points.length; i++) {
			actPoints[i]= new Point(points[i].x,points[i].y);
		}
	}

	public int getTypecode() {
		return typecode;
	}
	
}

