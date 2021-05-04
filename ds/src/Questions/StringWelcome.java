package Questions;

import java.util.Scanner;

public class StringWelcome {
static final String dictionary[]= {"welcome"};
static final int n=dictionary.length;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int dimension=0;
		while(sc.hasNextLine()) {
			int count=0;
			if(count==0) {
				String in = sc.next();
				dimension = Integer.parseInt(in);
			}
			String matrix = sc.next();
			String[] letter = matrix.split(" ");
			String[][] words=new String[dimension][dimension];
			int index=0;
			for(int i=0;i<4 && index<letter.length;i++) {
				for(int j=0;j<4 && index<letter.length;j++,index++) {
					words[i][j]=letter[index];
				}
			}
		}
	}

}
