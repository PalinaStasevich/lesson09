package lt.lhu.unit06.main;

import java.util.Random;

public class Task29 {

	public static void main(String[] args) {
		int n = 8;
		Random rand = new Random();
		int[][] mas = new int[n][n];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000) - 500;
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i][i] >= 0) {
				System.out.printf("{%4d}", mas[i][i]);
			}
		}
	}

}
