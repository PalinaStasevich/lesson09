package lt.lhu.unit06.main;

import java.util.Random;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int[][] mas = new int[9][9];
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
		System.out.println("Введите k строки: ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Неверный ввод. Введите k: ");
		}
		int k = sc.nextInt();
		System.out.println("Введите p столбец: ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Неверный ввод. Введите p: ");
		}
		int p = sc.nextInt();
		System.out.println("-----------------");
		for (int element : mas[k]) {
			System.out.printf("{%4d}", element);
		}
		System.out.println("\n-----------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("{%4d}", mas[i][p]);
			System.out.println();
		}
		System.out.println();
		
	}
	
}
