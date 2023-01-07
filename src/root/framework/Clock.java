package root.framework;

public class Clock extends Thread{
public boolean connected = true;

public Clock(){

}
public void run(){
	while(true){
		if(connected){
		try {
			Thread.sleep(Settings.timingLimiter);
			
			
			JGame.tick();
		} catch (Exception e) {
			Util.printErr("CLOCKING ISSUE!!!", Clock.class);
			e.printStackTrace();
			connected = false;
		}}
		
	}
}
}
