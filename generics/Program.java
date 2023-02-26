package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 2000.00));
        list.add(new Product("Iphone", 3500.00));
			
		Product x = CalculationService.max(list);
		System.out.println("Most expensive:");
		System.out.println(x);

	}
}

