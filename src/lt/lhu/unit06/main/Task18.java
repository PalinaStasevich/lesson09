package lt.lhu.unit06.main;

public class Task18 {

	public static void main(String[] args) {
		int n = 8;
		int[][] mas = new int[n][n];
		for (int i = 0, k = 1; i < mas.length; i++, k++) {
			for (int j = 0; j < mas[i].length - i; j++) {
				mas[i][j] = k;
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d]", mas[i][j]);
			}
			System.out.println();
		}

	}

}
