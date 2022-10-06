
public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***" + "\n");	
	} //end log method

	@Override
	public void error(String error) {
		System.out.println("******************" + "\n***Error: "+ error +"***" + "\n******************\n");
	} //end error method

}
