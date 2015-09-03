package config;
/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015年8月23日 上午10:02:57 
 * @version 1.0 
 */
public class ConfigFactory {
	private static GameConfig GAME_CONFIG =null;
	static{
		try {
			GAME_CONFIG=new GameConfig();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static GameConfig getGameConfig(){
		return GAME_CONFIG;
	}
}

