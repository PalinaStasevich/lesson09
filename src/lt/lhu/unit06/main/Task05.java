package lt.lhu.unit06.main;

import java.util.Random;

public class Task05 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] mas = new int[5][7];
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
		for (int i = 0; i < mas.length; i = i + 2) {
			System.out.printf("%2d строка - ", i);
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("{%3d} ", mas[i][j]);
			}
			System.out.println();
		}

	}

}
