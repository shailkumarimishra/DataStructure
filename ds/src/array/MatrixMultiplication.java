package array;

import java.util.Scanner;

public class MatrixMultiplication {
	private int row_Matrix1;
	private int column_Matrix1;
	private int row_Matrix2;
	private int column_Matrix2;
	private int[][] matrix1;
	private int[][] matrix2;
	private int[][] matrix2_Transpose;
	private int[][] result;

	public void insertRowColumn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row in Matrix1: ");
		this.row_Matrix1 = sc.nextInt();
		System.out.println("Enter number of column in Matrix1: ");
		this.column_Matrix1 = sc.nextInt();
		System.out.println("Enter number of row in Matrix2: ");
		this.row_Matrix2 = sc.nextInt();
		System.out.println("Enter number of column in Matrix2: ");
		this.column_Matrix2 = sc.nextInt();
	}

	public boolean validateMatrix() {
		if (this.column_Matrix1 == this.row_Matrix2) {
			this.matrix1 = new int[this.row_Matrix1][this.column_Matrix1];
			this.matrix2 = new int[this.row_Matrix2][this.column_Matrix2];
			this.matrix2_Transpose = new int[this.column_Matrix2][this.row_Matrix2];
			this.result = new int[this.row_Matrix1][this.row_Matrix2];
			return true;
		}
		return false;
	}

	public void matrixData() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < this.row_Matrix1; i++) {
			for (int j = 0; j < this.column_Matrix1; j++) {
				System.out.println("Enter data for Matrix1: ");
				this.matrix1[i][j] = sc.nextInt();
			}

		}
		System.out.println("Matrix1 data is succefully entered");
		for (int i = 0; i < this.row_Matrix2; i++) {
			for (int j = 0; j < this.column_Matrix2; j++) {
				System.out.println("Enter data for Matrix2: ");
				this.matrix2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix2 data is successfully entered");
	}

	public void matrixMultiplication() {
		for (int i = 0; i < this.column_Matrix2; i++) {
			for (int j = 0; j < this.row_Matrix2; j++) {
				this.matrix2_Transpose[i][j] = this.matrix2[j][i];
			}
		}

		for (int k = 0; k < this.row_Matrix1; k++) {
			for (int l = 0; l < this.column_Matrix2; l++) {
				for (int j = 0; j < this.column_Matrix1; j++) {
					this.result[k][l] = this.matrix1[k][j] * this.matrix2_Transpose[l][j] + this.result[k][l];
				}

			}
		}
	}

	public void display() {
		System.out.println("Matrix1= ");
		for (int i = 0; i < this.row_Matrix1; i++) {
			for (int j = 0; j < this.column_Matrix1; j++) {
				System.out.print(this.matrix1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Matrix2= ");
		for (int i = 0; i < this.row_Matrix2; i++) {
			for (int j = 0; j < this.column_Matrix2; j++) {
				System.out.print(this.matrix2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Matrix1 * Matrix2= ");
		for (int i = 0; i < this.row_Matrix1; i++) {
			for (int j = 0; j < this.column_Matrix2; j++) {
				System.out.print(this.result[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MatrixMultiplication mul = new MatrixMultiplication();
		mul.insertRowColumn();
		if (mul.validateMatrix()) {
			mul.matrixData();
			mul.matrixMultiplication();
			mul.display();
		} else {
			System.out.println("invalid dimension");
		}

	}
}
