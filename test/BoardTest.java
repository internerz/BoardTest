package BoardTest.test;

import static org.junit.Assert.*;
import org.junit.*;
import BoardTest.*;

public class BoardTest {
	
	Board board;

	@Before
	public void init() {
		board = new Board();
	}

	@Test
	public void emptyBoard() {
		assertEquals(board.hasWinner(), false);
	}
	
	@Test
	public void noWinner() throws InvalidPositionException {
		board.setMark("X", 0, 0);
		board.setMark("O", 1, 0);
		board.setMark("X", 0, 1);
		board.setMark("O", 1, 1);
		board.setMark("X", 2, 2);
		
		assertEquals(board.hasWinner(), false);
	}
	
	@Test
	public void hasWinner() throws InvalidPositionException {
		board.setMark("X", 0, 0);
		board.setMark("X", 0, 1);
		board.setMark("X", 0, 2);
		
		assertEquals(board.hasWinner(), true);
	}
	
	@Test (expected = InvalidPositionException.class)
	public void invalidPosition() throws InvalidPositionException {
		board.setMark("X", 0, 3);
	}

}
