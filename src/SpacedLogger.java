
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		StringBuilder newLog = new StringBuilder();
		for (int i = 0; i < log.length(); i++)
		{
			newLog.append(log.charAt(i) + " ");
		}
		
		System.out.println(newLog.toString() + "\n");
	} //end log method

	@Override
	public void error(String error) {
		StringBuilder newLog = new StringBuilder();
		for (int i = 0; i < error.length(); i++)
		{
			newLog.append(error.charAt(i) + " ");
		}
		
		System.out.println("ERROR: " +newLog.toString());	
	} //end error method

}
