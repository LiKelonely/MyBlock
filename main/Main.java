package main;

import control.GameControl;
import control.PlayerControl;
import dto.GameDto;
import service.GameService;
import ui.MyFrameGame;
import ui.MyPanelGame;
public class Main {

	public static void main(String[] args) {
		//创建游戏数据源
		GameDto gamedto = new GameDto();
		//创建游戏面板
		MyPanelGame m_p_g = new MyPanelGame(gamedto);
		//创建游戏逻辑快（安装游戏数据源）
		GameService gservice = new GameService(gamedto);
		//创建游戏控制器（连接游戏面板与游戏逻辑快）
		GameControl gameControl =  new GameControl(m_p_g, gservice);
		//创建玩家控制器（连接游戏控制器）
		PlayerControl pcontrol = new PlayerControl(gameControl);
		m_p_g.setGameControl(pcontrol);
		//创建游戏窗口。安装游戏面板
		MyFrameGame m_f_g = new MyFrameGame(m_p_g);
	}

}
