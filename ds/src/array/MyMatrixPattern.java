package array;

public class MyMatrixPattern {
public static void printBoundaryElement(int[][] inputs) {
	if(inputs.length==1) {
		for(int col=0;col<inputs.length;col++) {
			System.out.print(inputs[0][col]+" ");
		}
	}
	else if(inputs[0].length==1) {
		for(int row=0;row<inputs.length;row++) {
			System.out.print(inputs[row][0]+" ");
		}
	}
	else {
		for(int i=0;i<inputs.length;i++) {
			System.out.print(inputs[0][i]+" ");
		}
		for(int i=1;i<inputs.length;i++) {
			System.out.print(inputs[i][inputs.length-1]+" ");
		}
		for(int i=inputs.length-2;i>=0;i--) {
			System.out.print(inputs[inputs.length-1][i]+" ");
		}
		for(int i=inputs.length-2;i>0;i--) {
			System.out.print(inputs[i][0]+" ");
		}
}
}
 public static void printSpiralPattern(int[][] inputs) {
	 int top=0;
	 int right=inputs.length-1;
	 int bottom=inputs.length-1;
	 int left=0;
	 while(top<=bottom && left<=right) {
	 for(int i=left;i<=right;i++) {
		 System.out.print(inputs[top][i]+" ");
	 }
	 top++;
	 for(int i=top;i<=bottom;i++) {
		 System.out.print(inputs[i][right]+" ");
	 }
	 right--;
	 if(top<=bottom) {
		 for(int i=right;i>=left;i--) {
			 System.out.print(inputs[bottom][i]+" ");
		 }
		 bottom--;
	 }
	 if(left<=right) {
		 for(int i=bottom;i>=top;i--) {
			 System.out.print(inputs[i][left]+" ");
		 }
		 left++;
	 }
 }
 }




public static void main(String[] args) {
	 int[][] array= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//	 printBoundaryElement(array);
	printSpiralPattern(array); 
}
}
