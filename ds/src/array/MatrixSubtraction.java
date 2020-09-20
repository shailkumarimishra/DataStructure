package array;

import java.util.Scanner;

public class MatrixSubtraction {
	private int[][] matrix1;
	private int[][] matrix2;
	private int row_Matrix1;
	private int column_Matrix1;
	private int row_Matrix2;
	private int column_Matrix2;
	private int[][] subtraction;

	public void insertRowColumn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row in Matrix1: ");
		this.row_Matrix1 = sc.nextInt();
		System.out.println("Enter number of coloumn in Matrix1: ");
		this.column_Matrix1 = sc.nextInt();
		System.out.println("Enter number of row in Matrix2: ");
		this.row_Matrix2 = sc.nextInt();
		System.out.println("Enter number of coloumn in Matrix2: ");
		this.column_Matrix2 = sc.nextInt();
	}

	public boolean validateDimension() {
		if (this.row_Matrix1 == this.row_Matrix2 && this.column_Matrix1 == this.column_Matrix2) {
			return true;
		}
		return false;
	}

	public void matrixDataInsertion() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < this.row_Matrix1; i++) {
			for (int j = 0; j < this.column_Matrix1; j++) {
				System.out.println("Enter data of Matrix1: ");
				this.matrix1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < this.row_Matrix2; i++) {
			for (int j = 0; j < this.column_Matrix2; j++) {
				System.out.println("Enter data of Matrix2: ");
				this.matrix2[i][j] = sc.nextInt();
			}
		}
	}

	public void matrixSubtraction() {
		this.subtraction = new int[row_Matrix1][column_Matrix1];
		for (int i = 0; i < row_Matrix1; i++) {
			for (int j = 0; j < column_Matrix1; j++) {
				subtraction[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		System.out.println("Subtraction Of 2 Matrix = ");
		for (int i = 0; i < row_Matrix1; i++) {
			for (int j = 0; j < column_Matrix1; j++) {
				System.out.print(subtraction[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		MatrixSubtraction sub = new MatrixSubtraction();
		sub.insertRowColumn();
		if (sub.validateDimension()) {
			sub.matrix1 = new int[sub.row_Matrix1][sub.column_Matrix1];
			sub.matrix2 = new int[sub.row_Matrix2][sub.column_Matrix2];
			sub.matrixDataInsertion();
			sub.matrixSubtraction();
		} else {
			System.out.println("Invalid dimensions...Two matrix can be subtracted only if they have same dimensions");
		}
	}
}
