package array;

public class MatrixPattern {
private int[][] array= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
public void snakePattern() {
	int i=0;
	int count=1;
	while(i<4) {
		if(count++%2!=0) {
			for(int j=3;j>=0;j--) {
				System.out.print(this.array[i][j]+" ");
			}
			System.out.println();
			i++;
		}
		else {
			for(int j=0;j<4;j++) {
				System.out.print(this.array[i][j]+" ");
			}
			System.out.println();
			i++;
		}
	}
}
public void display() {
	for(int i=0;i<4;i++) {
		for(int j=0;j<4;j++) {
			System.out.print(this.array[i][j]+" ");
		}
		System.out.println();
	}
}
public void boundaryTraversal() {
int boundary=4;//always 4
int right=4;//equal to no of column
int down=3;//equal to no of row-1
int left=3;//equal to no of column-1
int up=2;//equal to no of row-2
int move=0;
while(move<boundary) {
	for(int j=0;j<right;j++) {

		if(move==0){
			System.out.print(array[move][j]+" ");
		}
		else if(move==1){
			right=down;
			System.out.print(array[j+1][down]+" ");
		}
		else if(move==2){
			right=down;
			System.out.print(array[down][--left]+" ");
		}
		else{
			right=move-1;
			System.out.print(array[up--][j-j]+" ");
		}
		}
	move++;
	}
}

public static void main(String[] args) {
	MatrixPattern pattern=new MatrixPattern();
	pattern.display();
	System.out.println("**************");
	pattern.snakePattern();
	System.out.println("**************");
	pattern.boundaryTraversal();
}

}
