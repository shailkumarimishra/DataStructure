package ds;
/*
 * Divisors Always appear in pairs.
 * If (x,y) is a pair then x*y=n
 * and if x<=y 
 * => x*x<=n
 * x<=sqrt(n)
 * 
 * Algorithm:- It is a combination of sequence of finite steps to solve a particular problem.
 * Example-> 	int add(int a, int b){
 * 					int c=a+b;
 * 					return c;
 * 				}	
 * Algorithm Properties:-
 * 1. It should produce at least one output.
 * 2. It should take 0 or more input.
 * 3. It should terminate within finite time.
 * 4. Every step in the algorithm should be deterministic (no choice or no ambiguity).
 * 5. It should be programming independent.	
 * 6. Every step in the algorithm should perform something.
 * 
 * Steps to construct Algorithm:-
 * 1. Problem Definition. 
 * 2. Design Algorithm.***	
 * 3. Flow Chart.
 * 4. Verification & Testing.  
 * 5. Coding (implementation).
 * 6. Analysis.***
 * 
 * Analysis (Time complexity & Space complexity) of Algorithm:-
 * 1.A=Theta(B) (Average case)
 * 2.A=BigO(B)  (Worst case)
 * 3.A=Omega(B) (Best case)
 * 
 * Types of Analysis:- 
 * 1. Relative Analysis
 * 2. Absolute Analysis
 * 
 * Q. Difference b/w Relative and Absolute Analysis?
 * Ans:-1. It is s/w and h/w dependent Analysis but
 * 		   It is s/w and h/w independent analysis.
 * 		2. It gives exact answer but it gives approximate answer.
 * 		3. Answering is changing from system to system but here answer will be same in all
 * 		   system.
 * 
 * Absolute Analysis:- It is a determination of order of magnitude of a statement.
 * here,order of magnitude means no of times a statement is executed while running.
 * 
 * Order of growth:-
 * 1. Direct way:- 
 * a) Ignore lower order terms
 * b) Ignore leading constant
 * 
 * Q. How do we know which terms are lower order ?
 * Ans:- Constant < loglog(n) < sqrt(logn) < logn < nlogn < sqrt(n) < n < n^2 < n^3 < n^k < c^n.   
 */
public class Theory {
	
	// Time complexity will be O(n).
	public static boolean isPrimeV1(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}
// Time Complexity will be O(sqrt(n)).
	public static boolean isPrimeV2(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			if(n% i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {

	}
}
