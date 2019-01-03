package application;

import java.util.Locale;
import java.util.Scanner;

public class MatrixApp {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter for number line: ");
		int l = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter for number colum:");
		int c = sc.nextInt();

		int[][] mat = new int[l][c];

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("----------------------------");
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
