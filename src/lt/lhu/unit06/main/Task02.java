package lt.lhu.unit06.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] mas = new int[2][3];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
	}

}
