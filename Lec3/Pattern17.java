package Lec3;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int star = n / 2;
		int space = 1;
		while (row <= n) {
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int k = 1;
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			// Mirror
			if (row <= n / 2) {// row<=n/2ß
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}

			// next line ki prep
			System.out.println();
			row++;

		}
	}

}
