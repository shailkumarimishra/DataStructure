package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoodCourtBill {
	private static Map<Integer, Integer> order;
	public double price(int index) {
		double []price= {50,100,40,200,300};
		return price[index];
	}
	public FoodCourtBill() {
		order=new HashMap<>();
	}
	public static void main(String[] args) {
		FoodCourtBill food=new FoodCourtBill();
		Scanner sc=new Scanner(System.in);
		String moreOrder="n";
		double sum=0;
		double bill=0;
		String member;
		do {
			System.out.println("Enter menu number: ");
			int menu = sc.nextInt();
			System.out.println("Enter Quantity: ");
			int quantity = sc.nextInt();
			if((menu>0 && menu<7) && (quantity>0 && quantity<7)) {
				order.put(menu,quantity);
			}
			else {
				System.out.println("INVALID INPUT");
				break;
			}
			System.out.println("more Items ?(y/n): ");
			moreOrder = sc.next();
		}while(moreOrder.equalsIgnoreCase("y"));
		System.out.println("Are you member?(y/n): ");
		member=sc.next();
		sc.close();
		for(Map.Entry<Integer, Integer> map:order.entrySet()) {
			Integer index = map.getKey();
			Integer number = map.getValue();
			sum=sum+(food.price(index-1)*number);
			if(sum>1000 && member.equalsIgnoreCase("y")) {
				bill=sum-(sum*0.15);
			}
			else if(sum>1000 && (member!="y"|| member!="Y")) {
				bill=sum-(sum*0.10);
			}
			else if(sum<1000 && member.equalsIgnoreCase("y")) {
				bill=sum-(sum*0.05);
			}
			else {
				bill=sum;
			}
		}
		System.out.println(bill+" "+"INR");
	}
}
