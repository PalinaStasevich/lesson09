package lt.lhu.unit06.main;

import java.util.Random;

public class Task38 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] mas = new int[3][4];
		int[][] mas1 = new int[3][4];
		int sum = 0;
		int sum1 = 0;
		int result = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------------");
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				mas1[i][j] = rand.nextInt(100);
			}
		}
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.printf("{%4d}", mas1[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------------");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				sum += mas[i][j];
			}
		}
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				sum1 += mas1[i][j];
			}
		}
		result = sum + sum1;
		System.out.println("Сумма двух массивов = " + result);
	}

}
