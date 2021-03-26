package Questions;

import java.util.function.Predicate;

public class MinimizeCodeLength {
/*public boolean abcd(int h) {
	if(h==0) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	return false;
}*/
//	Method 1:-
	public boolean abcd(int h) {
		if(h==0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(new MinimizeCodeLength().abcd(0));
//		Method 2:-
		  Predicate<Integer> result=(h)->{ if(h==0) return true; return false; };
		  System.out.println(result.test(1));
		 
	}
}
