package itc155_workspace;

import java.util.*;

public class Assignment4 {

	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("Marty", "Stepp");
		map1.put("Harry", "McClarn");
		System.out.println(isUnique(map1));
		Map<String, String> map2 = new TreeMap<String, String>();	
		map2.put("Marty", "Stepp");
		map2.put("Harry", "Stepp");
		
		System.out.println(isUnique(map2));
	}

	private static boolean isUnique(Map<String, String> map1) {
		if(map1.size() < 1) return true;
		else {
			Set<String> values = new HashSet<String>();
			
			for(String value: map1.values()) {
				if(values.contains(value)) {
					return false;
				}else {
					values.add(value);
				}
			}
			return true;
			
		}
		
	}

}
