/**
 * Class math.
 * Play with math method. 
 * No bigger thought yet.
 */


public class MathTry {																						

	public MathTry() {
	}

	public static void main(String[] args) {
		Main.LOGGER.info("");

		Prin.l("Math.abs: " + Math.abs(0));
		Prin.l("Math.min:" + Math.min(10, 1));
		Prin.l("Math.random: " + Math.random());
		
		//Only for funny:
		Prin.l("Do you know why it is zero?: " + (int)(Math.random()));
	}

}
