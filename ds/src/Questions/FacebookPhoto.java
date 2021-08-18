package Questions;

import java.util.Scanner;

public class FacebookPhoto {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String input = sc.nextLine();
	String[] no = input.split(" ");
	int s = Integer.parseInt(no[0]);
	int w = Integer.parseInt(no[1]);
	int h = Integer.parseInt(no[2]);
	if(s>w||s>h) {
		System.out.println("CHANGE");
	}
	else if((s<=w && s<=h)&&(w==h)) {
		System.out.println("ACCEPTED");	
	}
	else {
		System.out.println("CROP");
	}
}
}
