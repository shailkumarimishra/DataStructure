package Questions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permutation {
public static Set<String> getPermutation(String str){
	Set<String> permutation=new HashSet<>();
	if(str==null) {
		return null;
	}
	else if(str.length()==0) {
		permutation.add("");
		return permutation;
	}
	char first=str.charAt(0);
	String sub = str.substring(1);
	Set<String> words = getPermutation(sub);
	for(String strNew:words) {
		for(int z=0;z<=strNew.length();z++) {
			permutation.add(strNew.substring(0,z)+first+strNew.substring(z));
		}
	}
	return permutation;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String input = sc.nextLine();
	sc.close();
	Set<String> permutation = getPermutation(input);
	Object[] array = permutation.toArray();
	String temp;
	for(int i=0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++) {
			if(array[i].toString().compareTo(array[j].toString())>0) {
			temp=(String) array[i];
			array[i]=array[j];
			array[j]=temp;
			}
		}
	}
	for(int k=0;k<array.length;k++) {
		if(k!=array.length-1)
		System.out.print(array[k]+",");
		else
			System.out.println(array[k]);
	}
	
	
}
}
