package Questions;

public class ReverseString {
public static void main(String[] args) {
	String s="P R A D E E P";
//	Method-1
	StringBuilder sb=new StringBuilder();
	sb.append(s);
	System.out.println(sb.reverse());
//	Method-2
	String[] split = s.split(" ");
	String reverse="";
	for(int i=split.length-1;i>=0;i--) {
		reverse=reverse+split[i]+" ";
	}
	System.out.println(reverse);
}
}
