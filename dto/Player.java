package dto;
/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015��8��23�� ����7:17:49 
 * @version 1.0 
 */
public class Player {
	private String name;
	
	private int point;

	public Player(String name, int point) {
		super();
		this.name = name;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
}

