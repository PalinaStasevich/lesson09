package lt.lhu.unit06.main;

import java.util.Random;

public class Task08 {

	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(10) + 2;
		int m = rand.nextInt(10) + 2;
		int count7 = 0;
		int[][] mas = new int[n][m];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(11);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%3d]", mas[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 7) {
					count7++;
				}
			}
		}
		System.out.println("Число 7 встречается " + count7 + " раз");
	}

}
