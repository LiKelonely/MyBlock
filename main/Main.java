package main;

import control.GameControl;
import control.PlayerControl;
import dto.GameDto;
import service.GameService;
import ui.MyFrameGame;
import ui.MyPanelGame;
public class Main {

	public static void main(String[] args) {
		//������Ϸ����Դ
		GameDto gamedto = new GameDto();
		//������Ϸ���
		MyPanelGame m_p_g = new MyPanelGame(gamedto);
		//������Ϸ�߼��죨��װ��Ϸ����Դ��
		GameService gservice = new GameService(gamedto);
		//������Ϸ��������������Ϸ�������Ϸ�߼��죩
		GameControl gameControl =  new GameControl(m_p_g, gservice);
		//������ҿ�������������Ϸ��������
		PlayerControl pcontrol = new PlayerControl(gameControl);
		m_p_g.setGameControl(pcontrol);
		//������Ϸ���ڡ���װ��Ϸ���
		MyFrameGame m_f_g = new MyFrameGame(m_p_g);
	}

}
