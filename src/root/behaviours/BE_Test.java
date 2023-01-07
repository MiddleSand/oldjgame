package root.behaviours;

import java.util.Random;

import root.framework.GameObject;
import root.framework.Util;

public class BE_Test extends ObjectBehaviour{
	Random random;
	@Override public boolean tick(GameObject obj){
		random = new Random();
		Util.printNotice(random.nextBoolean(), BE_Test.class);
		return true;
	}

}
