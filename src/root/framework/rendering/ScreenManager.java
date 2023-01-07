package root.framework.rendering;

public class ScreenManager {
public RenderScreen rs;
int renderInterval;
int counter = 0;
public ScreenManager(RenderScreen resc, int renint) {
	if(resc==null) {
		rs = new RenderScreen();
	}else {
		rs=resc;
	}
	renderInterval = renint;
}
public void tick() {
	rs.paint();
}
}
