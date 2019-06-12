import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {
	int commonKeyValuePairs(HashMap<String,String> hashOne, HashMap<String,String> hashTwo) {
		int matching = 0;
		ArrayList<String> keys = new ArrayList<String>();
		keys.addAll(0, hashOne.keySet());
		for(int i = 0; i < hashOne.size(); i++) {
			String value1 = hashOne.get(keys.get(i));
			String value2 = hashTwo.get(keys.get(i));
			if(value1.equals(value2)) {
				matching ++;
			}
		}
		return matching;
	}
}
