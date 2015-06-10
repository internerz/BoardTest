package BoardTest;

public class InvalidPositionException extends Exception {
	
	public InvalidPositionException() {
		super("Marker out of position");
	}
	
}
