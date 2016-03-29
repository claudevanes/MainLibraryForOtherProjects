import java.util.logging.Logger;

public class Main {
	Main() {
	}

	 final static Logger LOGGER = Logger.getLogger(Main.class.getName());

	// This class is there for trying to all method for class from this project. 
	public static void main(String[] args) {
		LOGGER.info("Vypis programu.");
		System.out.println("Hello World!");

		Prin.l("Trying using class Prin.");

		Prin.t("Trying using class Prin.");
		
		
		
	}

}
