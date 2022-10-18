package lt.lhu.unit06.main;

import java.util.Random;

public class Task03 {

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
		System.out.println("Первый столбец");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("{%4d}", mas[i][0]);
			System.out.println();
		}
		System.out.println("Последний столбец");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("{%4d}", mas[i][mas[i].length - 1]);
			System.out.println();
		}

	}

}
