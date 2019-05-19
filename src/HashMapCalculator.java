import java.util.HashMap;

public class HashMapCalculator {
	int commonKeyValuePairs(HashMap<String,String> hashOne, HashMap<String,String> hashTwo) {
		int matching = 0;
		for(int i = 0; i < hashOne.size(); i++) {
			for(int j = 0; j < hashTwo.size(); j++) {
				if(hashOne.equals(hashTwo)) {
					matching ++;
				}
			}
		}
		return matching;
	}
}
