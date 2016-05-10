import java.util.logging.Logger;

public class Main {

	public Main() {
		 }

	static Sum summ = new Sum();

	final static Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		/**
		 * two different way, how to call method, sum is not-for our
		 * needes-static and its reason why we must write static Sum summ = new
		 * Sum(); ************
		 */
		summ.sum();

		// and ScannerTry and MathTry are static
		ScannerTry.scannerTry();
		MathTry.mathTry();

	}

}
