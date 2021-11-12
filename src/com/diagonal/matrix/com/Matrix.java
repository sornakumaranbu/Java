package com.diagonal.matrix.com;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rows / coloums value    : ");

		int rows = sc.nextInt();

		int col = rows;

		int[][] matrix = new int[rows][rows];

		System.out.println(" Enter the Element in the matrix    : ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {

				matrix[i][j] = sc.nextInt();
			}
		}

		// diagonal 1
		int sumOfD1 = 0;
		for (int i = 0, j = 0; i < rows && j < col; i++, j++) {

			sumOfD1 = sumOfD1 + matrix[i][j];
		}

		// diagonal 2
		int sumOfD2 = 0;
		for (int i = 0, j = col - 1; i < rows && j >= 0; i++, j--) {

			sumOfD2 = sumOfD2 + matrix[i][j];
		}

		System.out.println("Matrix Value are    :");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Enter the D1 diagonal value   :" + sumOfD1);
		System.out.println("Enter the D2 diagonal Value   :" + sumOfD2);

	}
}