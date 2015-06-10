package BoardTest;

public class Board {
	
	private String[][] board;
	
	public Board() {
		this.board = new String[3][3];
		
		for (int x = 0; x < this.board.length; x++) {
			for (int y = 0; y < this.board[x].length; y++) {
				board[x][y] = "";
			}
		}
	}
	
	public void setMark(String mark, int x, int y) throws InvalidPositionException {
		if (!(mark.equals("X") || mark.equals("O"))) {
			return;
		}
		
		if (x > 2 || x < 0 || y > 2 || y < 0) throw new InvalidPositionException();
		
		board[x][y] = mark;
	}
	
	public boolean hasWinner() {
		boolean hasWinner = false;
		
		if (
				(board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && !board[0][0].equals("") && !board[0][1].equals("") && !board[0][2].equals("")) ||
				(board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && !board[1][0].equals("") && !board[1][1].equals("") && !board[1][2].equals("")) ||
				(board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && !board[2][0].equals("") && !board[2][1].equals("") && !board[2][2].equals("")) ||
				(board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && !board[0][0].equals("") && !board[1][0].equals("") && !board[2][0].equals("")) ||
				(board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]) && !board[0][1].equals("") && !board[1][1].equals("") && !board[2][1].equals("")) ||
				(board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && !board[0][2].equals("") && !board[1][2].equals("") && !board[2][2].equals("")) ||
				(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals("") && !board[1][1].equals("") && !board[2][2].equals("")) ||
				(board[0][2].equals(board[1][1]) && board[1][1].equals(board[0][2]) && !board[0][2].equals("") && !board[1][1].equals("") && !board[0][2].equals(""))
			) {
			hasWinner = true;
		}
		
		return hasWinner;
	}
}