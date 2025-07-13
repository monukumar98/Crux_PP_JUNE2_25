package Lec11;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		Print(matrix);
	}

	public static void Print(int[][] matrix) {
		// TODO Auto-generated method stub
		int minr = 0, maxr = matrix.length - 1, minc = 0, maxc = matrix[0].length - 1;
		int te = matrix.length * matrix[0].length;
		int c = 0;
		while (c < te) {
			for (int i = minc; i <= maxc && c < te; i++) {
				System.out.print(matrix[minr][i] + " ");
				c++;
			}
			minr++;
			for (int i = minr; i <= maxr && c < te; i++) {
				System.out.print(matrix[i][maxc] + " ");
				c++;
			}
			maxc--;
			for (int i = maxc; i >= minc && c < te; i--) {
				System.out.print(matrix[maxr][i] + " ");
				c++;
			}
			maxr--;
			for (int i = maxr; i >= minr && c < te; i--) {
				System.out.print(matrix[i][minc] + " ");
				c++;
			}
			minc++;
		}
	}

}
