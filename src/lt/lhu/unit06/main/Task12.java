package lt.lhu.unit06.main;

public class Task12 {

	public static void main(String[] args) {
		int n = 8;
		int[][] mas = new int [n][n];
		for (int i = 0; i < mas.length; i++) {
			mas[i][i] = i;
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d]", mas[i][j]);
			}
			System.out.println();
		}

	}

}
