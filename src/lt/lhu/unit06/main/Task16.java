package lt.lhu.unit06.main;

public class Task16 {

	public static void main(String[] args) {
		int n = 8;
		int[][] mas = new int[n][n];
		for (int i = 0, k = 2; i < mas.length; i++, k++) {
			mas[i][i] = k * (k - 1);
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%3d]", mas[i][j]);
			}
			System.out.println();
		}

	}

}
