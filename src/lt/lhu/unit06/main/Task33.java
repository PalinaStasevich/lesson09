package lt.lhu.unit06.main;

import java.util.Random;

public class Task33 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] mas = new int[7][5];
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
		boolean sorted = false;
		int temp = 0;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < mas.length - 1; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					if (mas[i][j] > mas[i + 1][j]) {
						temp = mas[i][j];
						mas[i][j] = mas[i + 1][j];
						mas[i + 1][j] = temp;
						sorted = false;
					}
				}
			}
		}
		System.out.println("------------------------------");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("{%4d}", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for (int i = mas.length - 1; i >= 0; i--) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("{%4d}", mas[i][j]);
			}
			System.out.println();
		}

	}

}
