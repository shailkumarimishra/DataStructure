package Questions;
/*
 * -> Array contains both +ve and -ve elements.
 * -> -ve elements should contains even position.
 * -> +ve elements should contains odd position, until one of them exhaust.
 * -> no of +ve elements and -ve elements may not be equal.
 * -> if more +ve or -ve elements, then they should be placed at the end of the array
  	  in the order of appearance.
 * -> finally, return the rearranged array.
 * 
 * Assumption:- 
 * 1. Do not use new Array.
 * 2. Treat 0th index as even.
 * 3. Assume 0 as positive number.
 * 
 */
public class RearrangeArrayAlternately {
	public static int[] rearrangeArray(int[] array,int length) {
		for(int i=0;i<length;i++) {
			even:if(i%2==0) {
				if(!(array[i]<0)) {
					int j=i+1;
					while(j<length) {
						if(array[j]<0) {
							int move=array[i];
							int temp=array[j];
							array[i]=temp;
							int k=i+1;
							while(k<=j) {
								temp=array[k];
								array[k]=move;
								move=temp;
								k++;
							}
							break even;
						}
						j++;
					}
				}
			}
			odd:if(i%2!=0) {
				if(!(array[i]>0)) {
					int j=i+1;
					while(j<length) {
						if(array[j]>=0) {
							int move=array[i];
							int temp=array[j];
							array[i]=temp;
							int k=i+1;
							while(k<=j) {
								temp=array[k];
								array[k]=move;
								move=temp;
								k++;
							}
							break odd;	
						}
						j++;
					}
				}
			}
		}
		return array;
	}
	public static void main(String[] args) {
		int[] array= {12,-9,14,-5,-16,19};
		int[] rearrangeArray = RearrangeArrayAlternately.rearrangeArray(array,array.length);
		for(int result:rearrangeArray) {
			System.out.print(result+" ");
		}
	}
}
