package Questions;

import java.util.Scanner;

public class SquarePlot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int plots=0;
		int[] input;
		int count=0;
		for(int i=0;i<2;i++) {
			if(i==0) {
				String next=sc.nextLine();
				plots = Integer.valueOf(next);
			}
			else {
				for(int j=0;j<plots;j++) {
				String next=sc.nextLine();
				String[] areas = next.split(" ");
				input=new int[plots];
				for(int k=0;k<plots;k++) {
					input[k]=Integer.valueOf(areas[k]);
				}
				for(int z=0;z<plots;z++) {
				int val=input[z];
				double sqrt = Math.sqrt(val);
				if(sqrt-Math.floor(sqrt)==0) {
					count=count+1;
					if(z==plots-1)
					System.out.print(count);
				}
				}
				}
			}
		}
	}

}
