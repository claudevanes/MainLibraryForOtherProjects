/* Class scanner.
 *
 */
import java.util.Scanner;

public class ScannerTry {
	ScannerTry() {
	}

 
	 static void scannerTry() {

		String ss = "This is a blue line.";

		Scanner scanner = new Scanner(ss);
		
		
		Prin.l("" + scanner.next());
		Prin.l("" + scanner.next());
		Prin.l("" + scanner.next());
		Prin.l("" + scanner.next());
		Prin.l("Trying this class. ");
		
		scanner.close();

	}

 

}
