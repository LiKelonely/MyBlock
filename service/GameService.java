package service;

import java.awt.Point;
import java.util.Random;

import dto.GameDto;
import entity.GameAct;

/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015��8��23�� ����6:58:27 
 * @version 1.0 
 */
public class GameService {
	private GameDto dto;

	public GameService(GameDto dto) {
		this.dto = dto;
		GameAct act = new GameAct();
		dto.setGameAct(act);
	}

	public void keyup() {
			this.dto.getGameAct().round(this.dto.getGameMap());
		
	}
	public void keydown() {
		if(this.dto.getGameAct().move(0, 1,this.dto.getGameMap())){
			return;
		}
		boolean [][] map=this.dto.getGameMap();
		Point[] act = this.dto.getGameAct().getActPoint();
		for (int i = 0; i < act.length; i++) {
			map[act[i].x][act[i].y]=true;
		}
		//�ж��Ƿ��������
		//����������У����в���
		//��ֲ���
		//�ж��Ƿ�����
		//  ����
		//  ˢ��һ���µķ���
		
		this.dto.getGameAct().init(this.dto.getNext());
		this.dto.setNext(new Random().nextInt(7));
		
		
	}
	public void keyleft() {
			this.dto.getGameAct().move(-1, 0,this.dto.getGameMap());
		
	}
	public void keyright() {
			this.dto.getGameAct().move(1, 0,this.dto.getGameMap());
		
	}
//TODO======================����ר��=======================
	public void keylevel() {
		// TODO Auto-generated method stub
		this.dto.setLevel(this.dto.getLevel()+1);
	}
	
	
}

