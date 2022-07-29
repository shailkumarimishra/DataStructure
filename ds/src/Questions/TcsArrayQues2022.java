package Questions;

import java.util.*;
/**
 * 
 * @author Java Learning_point
 *
 */
public class TcsArrayQues2022 {
	
	private static int[] getNewArray(int[] inputArray) {
		int [] outputArray=new int[inputArray.length];
		int index=inputArray.length%2!=0?inputArray.length/2:(inputArray.length/2)-1;
		int left=index;
		int right=index;
		Arrays.sort(inputArray);
		for(int i=0;i<inputArray.length;i++) {
			if(i==0) {
				outputArray[index]=inputArray[i];
			}
			else if(i%2==0 && i!=0) {
				left=left-1;
				outputArray[left]=inputArray[i];
			}
			else {
				right=right+1;
				outputArray[right]=inputArray[i];
			}
		}
		return outputArray;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] inputArray=new int[sc.nextInt()];
		String[] split = sc.next().split(",");
		int j=0;
		for(String s:split) {
			inputArray[j++]=Integer.valueOf(s);
		}
		int[] result = getNewArray(inputArray);
		for(int i=0;i<result.length;i++) {
			if(i==result.length-1)
				System.out.println(result[i]);
			else
				System.out.print(result[i]+",");
		}
	}

}
