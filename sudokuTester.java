/** Import required libraries. */
import java.util.ArrayList;

/** Tests the sudokuSolver and Board classes.
 *	@author Pranay Patni
 	@date June 21, 2016
 */
public class sudokuTester {

	public static void main(String [] args) {

		/** Test the basic methods of the Board class. */
		Board board1 = new Board();
		//board1.printBoard();
		board1.setValue(0, 0, 9);
		//board1.printBoard();
		board1.setValue(0, 0, 7);
		//board1.printBoard();
		board1.setValue(0, 1, 8);
		//board1.printBoard();


		int[][] b2 = new int[][]{ {1, 3, 0, 0, 0, 6, 0, 0, 0},
								  {0, 7, 4, 0, 0, 2, 5, 8, 0},
								  {0, 0, 0, 0, 5, 0, 3, 0, 0},
						  		  {0, 8, 0, 0, 1, 0, 0, 0, 0},
								  {0, 0, 0, 0, 6, 0, 0, 2, 9},
								  {0, 0, 0, 0, 0, 0, 4, 3, 0},
								  {0, 0, 0, 0, 3, 0, 0, 5, 0},
								  {9, 0, 3, 0, 0, 0, 7, 0, 4},
								  {0, 0, 0, 0, 7, 5, 8, 0, 0}};


		int[][] b3 = new int[][]{ {0, 0, 0, 0, 5, 2, 0, 0, 0},
								  {8, 9, 0, 1, 0, 0, 6, 0, 0},
								  {0, 2, 0, 0, 0, 0, 0, 0, 1},
						  		  {0, 0, 0, 0, 1, 0, 0, 0, 0},
								  {0, 0, 5, 7, 0, 0, 1, 8, 0},
								  {0, 4, 7, 0, 3, 0, 0, 0, 0},
								  {0, 7, 0, 8, 0, 0, 2, 0, 0},
								  {0, 0, 6, 0, 0, 0, 3, 0, 0},
								  {0, 0, 0, 0, 0, 6, 0, 0, 0}};

		int[][] b4 = new int[][]{ {5, 0, 0, 0, 0, 0, 6, 0, 0},
								  {0, 9, 0, 0, 0, 4, 7, 2, 0},
								  {0, 0, 0, 0, 0, 0, 0, 8, 0},
						  		  {9, 0, 0, 4, 0, 0, 0, 0, 3},
								  {2, 0, 0, 0, 7, 1, 0, 0, 0},
								  {0, 0, 1, 0, 0, 8, 0, 7, 0},
								  {0, 0, 8, 0, 6, 0, 0, 0, 1},
								  {6, 0, 0, 3, 0, 2, 0, 0, 0},
								  {0, 0, 0, 0, 0, 0, 0, 0, 0}};

		Board board2 = new Board(b4);


		/** Test the Solver class. */
		sudokuSolver solver = new sudokuSolver();
		//solver.solve(board1);
		board2.printBoard();
		solver.solve(board2);
		//board2.printBoard();


	}
}


