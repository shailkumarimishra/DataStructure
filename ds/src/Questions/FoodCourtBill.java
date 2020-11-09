package Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FoodCourtBill {
	private static Map<Integer, Integer> order;
	
	public FoodCourtBill() {
		order=new HashMap<>();
		order.put(1,50);
		order.put(2,100);
		order.put(3,40);
		order.put(4,200);
		order.put(5,300);
	}
	private Map<Integer, Integer> convertToMap(String id, String quantity){
		String[] items = id.split(" ");
		String[] quantities = quantity.split(" ");
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<items.length;i++) {
			if(!isValidItemId(Integer.valueOf(items[i]))) {
				return null;
			}
			else {
				map.put(Integer.valueOf(items[i]),Integer.valueOf(quantities[i]));
			}
		}
		return map;
	}
	private boolean isValidQuantity(String id,String quantity) {
		return id.trim().length()==quantity.trim().length();
	}
	private boolean isValidItemId(int id) {
		return id>=1 && id<=5;
	}
	private int getPrice(int itemId) {
		return order.get(itemId);
	}
	
	public double totalAmount(String id,String quantity) {
		double sum=0;
		Map<Integer, Integer> items = convertToMap(id, quantity);
		for(Map.Entry<Integer, Integer> e : items.entrySet()) {
			sum=sum+getPrice(e.getKey())*e.getValue();
		}
		return sum;
	}
	public double afterDiscount(double totalAmount, String isMember) {
		if(totalAmount>1000 && "y".equalsIgnoreCase(isMember)) {
			return totalAmount-(0.15*totalAmount);
		}
		if(totalAmount>1000 && !"y".equalsIgnoreCase(isMember)) {
			return totalAmount-(0.10*totalAmount);
		}
		if(totalAmount<1000 && "y".equalsIgnoreCase(isMember)) {
			return totalAmount-(0.05*totalAmount);
		}
			return totalAmount;
	}
	public static void main(String[] args) {
		FoodCourtBill food=new FoodCourtBill();
		Scanner sc=new Scanner(System.in);
		String itemId = sc.nextLine();
		String quantity = sc.nextLine();
		String isMember = sc.nextLine();
		if(!food.isValidQuantity(itemId, quantity)  || food.convertToMap(itemId, quantity)==null) {
			System.out.println("INVALID INPUT");
		}
		else {
		double totalAmount = food.totalAmount(itemId, quantity);
		double afterDiscount = food.afterDiscount(totalAmount, isMember);
		System.out.println(afterDiscount+" "+"INR");
		sc.close();
		}
	}
}
