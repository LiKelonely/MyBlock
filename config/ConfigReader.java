package config;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/** 
 * @author  LiKe 
 * @E-mail: wangkai_like@163.com
 * @date:   2015年8月22日 下午10:25:28 
 * @version 1.0 
 */
public class ConfigReader {
	public static void readConfig() throws Exception{
		SAXReader reader = new SAXReader();
		Document Doc=reader.read("config/cfg.xml");
		Element game=Doc.getRootElement();
		Element frame=game.element("frame");
		List<Element> lays=frame.elements("lay");
		for(Element lay:lays){
			System.out.print(lay.attributeValue("class")+",");
			System.out.print(lay.attributeValue("x")+",");
			System.out.print(lay.attributeValue("y")+",");
			System.out.print(lay.attributeValue("width")+",");
			System.out.print(lay.attributeValue("height")+"\n");
			
		}
		String str = frame.attributeValue("width");
		System.out.println(str);
		
	}
	
	public static void main(String arg[]) throws Exception{
		readConfig();
	}
}

