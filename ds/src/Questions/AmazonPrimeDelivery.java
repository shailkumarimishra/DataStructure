package Questions;
/**
 * Amazon 2021 Question
 * Prime Order Prioritization:-
 * Amazon is releasing a prime order prioritization algorithm to optimize fulfilling prime deliveries on time.
 * All orders(prime or otherwise) are given an alphanumeric ID code.However,prime orders are given addition metadata 
 * that consists of a space-delimited list of lower case English letters,whereas non-prime orders are given metadata
 * that consists only of a space-delimited string of positive integers. Each order is therefore defined as their 
 * alphanumeric ID code, followed by a space,followed by their space-delimited metadata.
 * 
 *  The task is to sort a list of all orders in the order queue to assist in prioritization of fulfillment.They
 *  should be sorted according to the following order:
 *  1. The prime orders should be returned first,sorted by lexicographic sort of the alphabetic metadata.
 *  2. Only in the case of ties,the identifier should be used as a backup sort.
 *  3. The remaining non- prime orders must all come after, in the original order they were given in the input.
 * Write a function or method to return a list of strings representing the correctly prioritized orders according to
 * this system.
 * 
 *  Input:-
 *  The input to the function/method consists of one argument:
 *  orderList, a list of strings representing all of the orders.
 *  
 *  Output:-
 *  Return a list of strings representing the correctly prioritized orders according to this system. 
 *  
 *  Constraints:-
 *  0<= number of orders <=10^3
 *  
 *  Example:-
 *  
 *  Input:-
 *  orderList=
 *  [zid 93 12]
 *  [fp kindle book]
 *  [10a echo show]
 *  [17g 12 25 6]
 *  [ab1 kindle book]
 *  [125 echo dot second generation]
 *  
 *  Output:-
 *  [125 echo dot second generation]
 *  [10a echo show]
 *  [ab1 kindle book]
 *  [fp kindle book]
 *  [zid 93 12]
 *  [17g 12 25 6]
 *  
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AmazonPrimeDelivery {
	public static List<String> prioritizedOrders(List<String> order){
		List<String> prime=new ArrayList<>();
		List<String> nonPrime=new ArrayList<>();
		for(String or:order) {
			if(isAlphabetic(getMetaData(or))) {
				prime.add(or);
			}else {
				nonPrime.add(or);
			}
		}
		prime.sort(ALPHABETICAL_ORDER);
		prime.addAll(nonPrime);
		return prime;
	}
	private static String getMetaData(String order) {
		return order.substring(order.indexOf(" ")+1);
	}
	private static boolean isAlphabetic(String order) {
		return order!=null && order.matches("^[a-zA-Z\\s]*$");
	}
	private static Comparator<String> ALPHABETICAL_ORDER=new Comparator<String>() {
		public int compare(String str1,String str2) {
			int res=String.CASE_INSENSITIVE_ORDER.compare(str1.substring(str1.indexOf(" ")+1), str2.substring(str2.indexOf(" ")+1));
			if(res==0) {
				res=str1.substring(0,str1.indexOf(" ")).compareTo(str2.substring(0,str2.indexOf(" ")));
			}
			return res;
		}
	};
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<String> order=new ArrayList<>();
	while(sc.hasNextLine()) {
		String next = sc.nextLine();
		if("".equals(next)) {
			break;
		}
		order.add(next);
	}
	sc.close();
	List<String> deliveryOrder = prioritizedOrders(order);
	deliveryOrder.stream().forEach((orders)->System.out.println(orders));
}
}
