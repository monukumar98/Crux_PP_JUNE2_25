package Lec1;

public class Lottrry_Game2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 79;
		if (num >= 15 && num <= 20) {
			System.out.println("Bike");
			// ktm hero
			if (num >= 15 && num <= 18) {
				System.out.println("KTM");
			} else {
				System.out.println("hero");
			}
		} else if (num >= 50 && num <= 80) {
			System.out.println("Cycle");
			if (num >= 50 && num <= 70) {
				System.out.println("Nornal Cycle");
			} else {
				System.out.println("Gear Cycle");
			}
		} else if (num >= 100 && num <= 200) {
			System.out.println("Car");
			if (num >= 100 && num <= 150) {
				System.out.println("Creta");
			} else {
				System.out.println("Thar");
			}
		} else if (num >= 250 && num <= 300) {
			System.out.println("Mac");
			if (num >= 250 && num <= 280) {
				System.out.println("M1 Mac");
			} else {
				System.out.println("M4 MAC");
			}
		} else if (num >= 1200 && num <= 1400) {
			System.out.println("Kurkure");
		} else {
			System.out.println("Happay birthday!!!");
		}

	}
}
