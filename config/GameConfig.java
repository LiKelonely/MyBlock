package config;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015年8月22日 下午10:57:24 
 * @version 1.0 
 */
public class GameConfig {
	private int width;
	private int height;
	private int PADDING_START;
	private int PADDING_END;
	private int SIZE;
	private String title;
	
	public String getTitle() {
		return title;
	}
	private List<LayConfig> laysconfig;
	
	public GameConfig() throws Exception{
		SAXReader reader = new SAXReader();
		Document Doc=reader.read("config/cfg.xml");
		Element game=Doc.getRootElement();
		this.setUiConfig(game.element("frame"));

	}
	private void setUiConfig(Element frame){
		title=frame.attributeValue("title");
		width=Integer.parseInt(frame.attributeValue("width"));
		height=Integer.parseInt(frame.attributeValue("height"));
		PADDING_START=Integer.parseInt(frame.attributeValue("PADDING_START"));
		PADDING_END=Integer.parseInt(frame.attributeValue("PADDING_END"));
		SIZE=Integer.parseInt(frame.attributeValue("SIZE"));
		
		List<Element> lays=frame.elements("lay");
		laysconfig = new ArrayList<LayConfig>();
		for(Element lay:lays){
			LayConfig lc = new LayConfig(
					lay.attributeValue("ClassName"),
					Integer.parseInt(lay.attributeValue("x")),
					Integer.parseInt(lay.attributeValue("y")),
					Integer.parseInt(lay.attributeValue("width")),
					Integer.parseInt( lay.attributeValue("height"))
					);
			laysconfig.add(lc);
		}
	}
	
	private void setSystemConfig(Element frame){
		
	}
	
	private void setSystemData(Element frame){
		
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getPADDING_START() {
		return PADDING_START;
	}
	public int getPADDING_END() {
		return PADDING_END;
	}
	public int getSIZE() {
		return SIZE;
	}
	public List<LayConfig> getLaysconfig() {
		return laysconfig;
	}
	
}

