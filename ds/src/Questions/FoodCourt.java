package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoodCourt {
private static Map<Integer, Integer> order;
public double price(int index) {
	double []price= {80.0,130.0,100.0,80.0,90.0,110.0,120.0,140.0,70.0,80.0,130.0,160.0,70.0,60.0,40.0,50.0,30.0,40.0,160.0,150.0};
	return price[index];
}
public FoodCourt() {
	order=new HashMap<>();
}
public static void main(String[] args) {
	FoodCourt food=new FoodCourt();
	Scanner sc=new Scanner(System.in);
	String moreOrder="n";
	double sum=0;
	do {
		System.out.println("Enter menu number: ");
		int menu = sc.nextInt();
		System.out.println("Enter Quantity: ");
		int quantity = sc.nextInt();
		if((menu>0 && menu<21) && (quantity>0 && quantity<21)) {
			order.put(menu,quantity);
		}
		else {
			System.out.println("INVALID INPUT");
			break;
		}
		System.out.println("more Items ?(y/n): ");
		moreOrder = sc.next();
	}while(moreOrder.equalsIgnoreCase("y"));
	sc.close();
	for(Map.Entry<Integer, Integer> map:order.entrySet()) {
		Integer index = map.getKey();
		Integer number = map.getValue();
		sum=sum+(food.price(index-1)*number);
	}
	System.out.println("Total Amount: "+sum+" "+"INR");
}
}
