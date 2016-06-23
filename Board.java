/** Import necessary libraries. */ 
import java.util.ArrayList;
import java.util.Arrays;

/** The 9x9 Board data structure for Sudoku.
 *	@author Pranay Patni
 	@date June 21, 2016
 */
class Board {

	/** Initializes a board based on an inputted 2d array. */
	Board(int[][] board) {
		_board = board;
	}

	/** Intializes a blank board. */
	Board() {
		_board = new int[9][9];
		for (int[] row: _board) {
			Arrays.fill(row, 0);
		}
	}

	/** Returns the Rth row in the board. */
	int[] getRow(int r) {
		return _board[r];
	}

	/** Returns the Cth column in the board. */
	int[] getColumn(int c) {
		int[] column = new int[9];
		for(int i = 0; i < 9; i++) {
			column[i] = _board[i][c];
		}
		return column;
	}

	/** Sets the position in row R and column C to V. */
	void setValue(int r, int c, int v) {
		_board[r][c] = v;
	}

	/** Gets the value at position row R and column C. */
	int getValue(int r, int c) {
		return _board[r][c];
	}

	/** Returns true if none of the rows have conflicts. */
	private boolean validRows() {
		for (int r = 0; r <= 8; r++) {
			ArrayList<Integer> seen = new ArrayList<Integer>();
			for (int c = 0; c <= 8; c++) {
				int curr = _board[r][c];
				if (curr != 0) {
					if(seen.contains(curr)) {
						return false;
					}
					seen.add(curr);
				}
			}
		}
		return true;
	}

	/** Returns true if none of the columns have conflicts. */
	private boolean validColumns() {
		for (int c = 0; c <= 8; c++) {
			ArrayList<Integer> seen = new ArrayList<Integer>();
			for (int r = 0; r <= 8; r++) {
				int curr = _board[r][c];
				if (curr != 0) {
					if(seen.contains(curr)) {
						return false;
					}
					seen.add(curr);
				}
			}
		}
		return true;
	}

	/** Returns true if none of the boxes have conflicts. */
	private boolean validBoxes() {
		for (int c = 0; c <= 6; c = c + 3) {
			for (int r = 0; r <= 6; r = r + 3) {
				ArrayList<Integer> seen = new ArrayList<Integer>();
				for (int x = c; x <= c + 2; x++) {
					for(int y = r; y <= r + 2; y++) {
						int curr = _board[y][x];
						if (curr != 0) {
							if(seen.contains(curr)) {
								return false;
							}
							seen.add(curr);
						}
					}
				}
			}
		}
		return true;
	}

	/** Returns true if the board has no conflicts. */
	boolean isValid() {
		if(validRows() && validColumns() && validBoxes()) {
			return true;
		}
		return false;
	}

	/** Prints the board. */
	void printBoard() {
		System.out.println(Arrays.deepToString(_board));
	}

	/** The current state of the board. */
	private int[][] _board;
}