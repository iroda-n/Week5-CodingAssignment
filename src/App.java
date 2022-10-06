
public class App {

	public static void main(String[] args) {
		
		//test AsteriskLogger methods
		Logger asteriskLogger = new AsteriskLogger();
		asteriskLogger.log("Toast");
		asteriskLogger.error("Tap");
		
		//test SpacedLogger methods
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.log("Seal");
		spacedLogger.error("Testing");

	}

}
