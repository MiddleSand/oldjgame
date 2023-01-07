package root.framework;

import root.behaviours.BE_Test;
import root.framework.rendering.Light;
import root.framework.rendering.RenderScreen;
import root.framework.rendering.ScreenManager;
import root.framework.screen.JgameScreen;

public class JGame {
	static GameObject obj;
	 static ScreenManager r;
	public static void main(String[] args) {
Util.print("I'm awake!", JGame.class);
Util.printNotice("I think...", JGame.class);
Util.printErr("..therefore I am kind of an idiot!", JGame.class);
obj = new GameObject(new Vector(0,0));
r = new ScreenManager(null, 1);
//obj.addBehaviour(new BE_Test());
r.rs.lights[0]=new Light(10.0F, null);
JgameScreen.start(r);
Clock clock = new Clock();
clock.start();


	}
public static void tick(){
	obj.tick();
	try {
		r.rs.addToRenderBuffer(obj);

		}catch(Exception e) {
			e.printStackTrace();
		
			System.exit(0);
		}
	
	try {
	r.tick();

	}catch(Exception e) {
		e.printStackTrace();
	
		System.exit(0);
	}
	
}
}
