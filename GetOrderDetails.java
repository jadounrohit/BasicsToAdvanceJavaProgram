package java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetOrderDetails {

	public static void main(String[] args) {
		List<Order> orders=new ArrayList<Order>();
		orders.add(new Order(1,"Alice",150.0,"Completed"));
		orders.add(new Order(2,"Bob",300.0,"pending"));
		orders.add(new Order(3,"Alice",450.0,"Completed"));
		orders.add(new Order(4,"Dave",200.0,"Completed"));
		orders.add(new Order(5,"Bob",50.0,"Cancled"));
		
		//1.total amount completed orders?
		double result1 = orders.stream().filter(n->n.getStatus()=="Completed").
				mapToDouble(Order::getAmount).sum();
		System.out.println(result1); 
		
		//2.top 3 most expensive orders?
		List<Order>result2 = orders.stream().sorted(Comparator.comparing(Order::getAmount).reversed())
				.limit(3).collect(Collectors.toList());
		System.out.println(result2);
		
		//3.total spent by each customer?
		
		
	}

}
