package lt.lhu.unit06.main;

public class Task17 {

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = new int[n][n];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ((i == 0) | (j == 0) | (i == mas.length - 1) | (j == mas.length - 1)) {
					mas[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%3d]", mas[i][j]);
			}
			System.out.println();
		}
	}
}
