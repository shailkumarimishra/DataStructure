package ds;

public class BubbleSortExample {

	public static void main(String[] args) {
		int [] a= {30,40,80,20,60,10,90};
		int temp=0;
		int k=0;
		while(k<a.length-1) {
			for(int j=0;j<a.length-1;) {
				if(a[j]<a[j+1]) {
					j++;
				}
				else {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					j++;
				}
			}
			k++;
		}
		for(int z:a) {
			System.out.print(z+" ");
		}
	}

}
