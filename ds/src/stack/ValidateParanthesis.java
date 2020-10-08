package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidateParanthesis {
	private static List<String> getExpression() {
	 List<String> expressions=new ArrayList<>();
	 expressions.add("{");
	 expressions.add("(");
	 expressions.add("[");
	 return expressions;
	}
 public static boolean isValidExpression(String exp) {
	 String[] split = exp.split("");
	 Stack<String> stack=new Stack<>();
	 for(int i=0;i<split.length;i++) {
		 if(getExpression().contains(split[i])) {
			 stack.push(split[i]);
		 }
		 else {
			 if(stack.size()>0 && i<split.length) {
				 stack.pop();
			 }
		 }
	 }
	 return stack.isEmpty();
 }
 public static void main(String[] args) {
	boolean exp = isValidExpression("[(])");
	System.out.println(exp);
}
}
