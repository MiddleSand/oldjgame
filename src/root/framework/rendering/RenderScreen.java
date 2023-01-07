package root.framework.rendering;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import root.framework.GameObject;
import root.framework.Util;

public class RenderScreen extends JPanel {

	private static final long serialVersionUID = 6945011536549862537L;
	public static int renderables = 0;
	static ArrayList al = new ArrayList();



	public static Light[] lights = new Light[] {new Light(10.0F, null)};
	
/*	@Override*/ public void paint() {
	
			//Render the freaking object!!!!
			Iterator iter1 = al.iterator();
			while(iter1.hasNext()){
				RenderData r = (RenderData) iter1.next();
			//	System.out.println(r.table.get("imgPath"));
				try {
					BufferedImage bf = ImageIO.read(new File((String) r.table.get("imgPath")));
				} catch (Exception e) {
					//SHOOOOOT!
					Util.printErr("Loading image...KAAAABBBBOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOM!!!!",this.getClass());
					e.printStackTrace();
					Util.printErr("Problem Link: " + r.table.get("imgPath") ,this.getClass());
					System.exit(0);
				}
			}
			al.clear();
			for(int j = 0; j < lights.length; j++) {
			//	System.out.println(lights[j].luminocity);
			
			//basically cover the image with a dark semi-translucent rectangle then poke holes for the lights with respect to objects and shadows.
			//Do blending then volia!
		}
		
	}
public void addToRenderBuffer(GameObject obj) {
	try {
		al.add(obj.getRenderData());

		}catch(Exception e) {
			e.printStackTrace();
		
			System.exit(0);
		}
	
}
}
