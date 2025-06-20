package Lec2;

public class Pattern2 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = 1;
		while (row <= n) {
			// star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}

			// next line prep krna hai
			star++;
			row++;
			System.out.println();

		}
	}
}
