package root.framework.rendering;

import java.util.Hashtable;

public class RenderData {
public Hashtable table;
	public RenderData(String imgPath, float scale){
		table = new Hashtable();
		table.put("imgPath", imgPath);
		table.put("scale", scale);
	}
	
}
