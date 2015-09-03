package dto;

import java.util.List;

import entity.GameAct;

/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015年8月23日 下午7:16:56 
 * @version 1.0 
 */
public class GameDto {
	private List<Player> dbRecode;
	private List<Player> diskRecode;
	
	private boolean[][] gameMap;
	
	private GameAct gameAct;
	
	private int next;
	
	private int level;
	
	private int nowPoint;
	
	private int nowRemoveline;
	
	public GameDto(){
		this.dtoInit();
	}
	
	public void dtoInit(){
		this.gameMap = new boolean[10][18];
	}

	public List<Player> getDbRecode() {
		return dbRecode;
	}

	public void setDbRecode(List<Player> dbRecode) {
		this.dbRecode = dbRecode;
	}

	public List<Player> getDiskRecode() {
		return diskRecode;
	}

	public void setDiskRecode(List<Player> diskRecode) {
		this.diskRecode = diskRecode;
	}

	public boolean[][] getGameMap() {
		return gameMap;
	}

	public void setGameMap(boolean[][] gameMap) {
		this.gameMap = gameMap;
	}

	public GameAct getGameAct() {
		return gameAct;
	}

	public void setGameAct(GameAct gameAct) {
		this.gameAct = gameAct;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getNowPoint() {
		return nowPoint;
	}

	public void setNowPoint(int nowPoint) {
		this.nowPoint = nowPoint;
	}

	public int getNowRemoveline() {
		return nowRemoveline;
	}

	public void setNowRemoveline(int nowRemoveline) {
		this.nowRemoveline = nowRemoveline;
	}
}

