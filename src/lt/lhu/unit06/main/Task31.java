package lt.lhu.unit06.main;

import java.util.Random;

public class Task31 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] mas = new int[7][9];
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000) - 200;
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ((mas[i][j] >= -99) & (mas[i][j] <= -10)) {
					count++;
				}
				if ((mas[i][j] >= 10) & (mas[i][j] <= 99)) {
					count++;
				}
			}
		}
		System.out.println("Количество двузначных чисел = " + count);
	}

}
