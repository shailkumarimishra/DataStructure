package Questions;

public class ReplaceCharacter {
public static char[] replaceCharacter(char str[],int n,char ch1,char ch2) {
	if(str==null){
		return null;
	}
	int i;
	for(i=0;i<n;i++) {
		if(str[i]==ch1) {
			str[i]=ch2;
		}
		else if(str[i]==ch2) {
			str[i]=ch1;
		}
	}
	return str;
}
public static void main(String[] args) {
	char[] str= {'a','p','p','l','e','s'};
	char[] result = replaceCharacter(str,str.length,'a','p');
	for(char r:result) {
		System.out.print(r+"");
	}
}
}
