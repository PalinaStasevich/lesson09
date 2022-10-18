package lt.lhu.unit06.main;

import java.util.Random;

public class Task24 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] mas = new int[5][5];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(7);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) Math.pow(mas[i][j], i + 1);
				System.out.printf("{%4d}", mas[i][j]);
			}
			System.out.println();
		}

	}

}
