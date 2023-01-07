package root.framework;

import java.util.Hashtable;

import root.behaviours.ObjectBehaviour;
import root.framework.rendering.IRenderable;
import root.framework.rendering.RenderData;

public class GameObject implements IRenderable {
double posX;
double posY;
int tally = 0;
private RenderData dataR;
public static Hashtable<Integer, ObjectBehaviour> behaviours = new Hashtable();

public GameObject(Vector vector){
	posX=vector.vx;
	posY=vector.vy;
	dataR = new RenderData(Util.getDesktopDirectory()+"\\logo.png", 1F);
}

public void init(){
	
}
public RenderData getRenderData() {
	return dataR;
}
public boolean tick(){
	boolean noFail = true;
	
	for(int i = 0; i < tally; i++){
		Integer noo = new Integer(i);
		ObjectBehaviour b = (ObjectBehaviour) behaviours.get(noo);
		if(b.tick(this)==false){
			noFail = false;
			Util.printErr("Oh, DARN IT!!!!!!!",this.getClass());
			break;
		}
			
	}
	
	return noFail;
}

public void addBehaviour(ObjectBehaviour behaviour){
	
	behaviours.put(tally, behaviour);
	tally++;
}

public Hashtable render(RenderData renderDat, Vector renderVector) {
	
	return null;
}

}
