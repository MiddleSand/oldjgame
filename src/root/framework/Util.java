package root.framework;

public class Util {

	public static void print(Object message, Class classy){
		if(Settings.message){
			System.out.println("<<"+classy.getName()+">>: " + message);
			
		}
	}
	public static void printErr(Object message, Class classy){
		if(Settings.messageErr){
			System.out.println("++=ERR=++ <<"+classy.getName()+">>: " + message + " ++=ERR=++");
			
		}
	}
	public static void printNotice(Object message, Class classy){
		if(Settings.messageNotice){
			System.out.println("NOTICE <<"+classy.getName()+">>: " + message);
			
		}
	}
	public static String getMainDirectory() {
		return System.getProperty("user.dir");
	}
	public static String getDesktopDirectory() {
		return "C:\\Users\\westh\\Desktop";
	}
	
}
