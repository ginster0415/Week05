package Week05;

public class App {

	public static void main(String[] args) {
		
		Logger aLogger = new AsteriskLogger();
		
		aLogger.log("Jennifer");
		aLogger.error("Foster");
		
		Logger bLogger = new SpacedLogger();
		bLogger.log("Jennifer");
		bLogger.error("Foster");
	}

}
