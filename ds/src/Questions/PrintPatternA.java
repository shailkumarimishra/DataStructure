package Questions;

public class PrintPatternA {
public void printA() {
	for(int i=0;i<6;i++) {
		if(i==0) {
			System.out.println("**");
		}
		else if(i==2) {
			System.out.println("***");
		}
		else {
			System.out.println("* *");
		}
	}
}
public static void main(String[] args) {
	new PrintPatternA().printA();
}
}
