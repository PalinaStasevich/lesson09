package lt.lhu.unit06.main;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(10) + 3;
		int m = rand.nextInt(10) + 3;
		int[][] mas = new int[m][n];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("{%4d}", mas[i][j]);
			}
			System.out.println();
			i++;
			if (i >= mas.length) {
				break;
			}
			for (int j = mas[i].length - 1; j >= 0; j--) {
				System.out.printf("{%4d}", mas[i][j]);
			}
			System.out.println();
		}

	}

}
