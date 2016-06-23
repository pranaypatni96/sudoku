/** Solves an inputted sudoku Board 
 *	@author Pranay Patni
 	@date June 21, 2016
 */
class sudokuSolver {

	/** Default constructor. */
	sudokuSolver() {
	}

	/** Calls the recursive solver function to solve a board;
		prints an error message if not a valid board. */
	public void solve(Board board) {
		boolean solved = solver(0, 0, board);
		if(solved) {
			board.printBoard();
		}
		else {
			System.out.println("This is not a valid board.");
		}
	}

	/** The recursive helper solve function that starts with r = 0,
		c = 0, and initial board. */
	private boolean solver(int r, int c, Board board) {

		boolean solved = false;

		/** Checks to see if the end of the board has been reached. */ 
		if (r == 9) {
			return true;
		}

		/** If the board already has a value, jumps to the next value. */
		if(board.getValue(r, c) != 0) {
			if (c == 8) {
				solved = solver(r + 1, 0, board);
			} else {
				solved = solver(r, c + 1, board);
			}
			if (solved) {
				return true;
			} else {
				return false;
			}
		}

		/** Recursively fills in the board with the correct value. */
		for (int i = 1; i <= 9; i++) {
			board.setValue(r, c, i);
			if(board.isValid()) {
				solved = solver(r, c, board);
				if (solved) {
					return true;
				}
			}
			board.setValue(r, c, 0);
		}
		return false;
	}
}