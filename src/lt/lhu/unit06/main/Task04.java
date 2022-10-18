package lt.lhu.unit06.main;

import java.util.Random;

public class Task04 {

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
		System.out.println("Первая строка");
		for (int element : mas[0]) {
			System.out.printf("{%4d}", element);
		}
		System.out.println("\nПоследняя строка");
		for (int element : mas[mas.length - 1]) {
			System.out.printf("{%4d}", element);
		}

	}

}
