package generics;

import java.util.List;

public class CalculationService {

	public static <Generic extends Comparable<Generic>> Generic max(List<Generic> list) {
        
		Generic max = list.get(0);
		for (Generic item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
