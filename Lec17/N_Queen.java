package Lec17;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		print(board, 0, n);

	}

	public static void print(boolean[][] board, int row, int tq) {
		if (tq == 0) {
			Display(board);
			System.out.println();
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if (issafe(board, row, col)) {
				board[row][col] = true;
				print(board, row + 1, tq - 1);
				board[row][col] = false;
			}
		}

	}

	public static boolean issafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// up
		int r = row;
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}
		// left diagonal
		int c = col;
		r = row;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
		// right diagonal
		 c = col;
		r = row;
		while (r >= 0 && c<board[0].length) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}

}
