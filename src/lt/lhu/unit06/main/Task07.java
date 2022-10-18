package lt.lhu.unit06.main;

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] mas = new int[5][5];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000) - 300;
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ((mas[i][j] < 0) && (Math.abs(mas[i][j]) % 2 == 1)) {
					sum += Math.abs(mas[i][j]);
				}
			}
		}
		System.out.println("sum = " + sum);
	}

}
