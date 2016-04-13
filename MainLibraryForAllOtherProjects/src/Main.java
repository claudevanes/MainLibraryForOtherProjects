
// This class is there for trying to all method for classes from this project. 	
import java.util.logging.Logger;

public class Main {
	Main() {
	}

	/*
	 * This is main logger for all this project. You can called this in other
	 * classes like: Main.LOGGER.info("It uses only one LOGGER.");
	 */

	final static Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		LOGGER.info("Vypis programu.");
		System.out.println("Hello World!");

		Prin.l("Trying using class Prin.");

		Prin.t("Trying using class Prin.");

	}

}
