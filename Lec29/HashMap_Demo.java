package Lec29;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 78);
		map.put("Ankita", 76);
		map.put("Kunal", 55);
		map.put("Ankit", 89);
		map.put("Puneet", 79);
		map.put("Raju", 78);
		map.put("Shiva", 56);
		map.put("Kunal", 85);
////		map.put(null, 77);
////		map.put(null, 177);
		System.out.println(map);
//		// containsKey
//		System.out.println(map.containsKey("Kaju"));
//		System.out.println(map.containsKey("Raju"));
//		// get
//		System.out.println(map.get("Kaju"));
//		System.out.println(map.get("Raju"));
//		// remove
//		System.out.println(map.remove("Kaju"));
//		System.out.println(map.remove("Raju"));
//		System.out.println(map);
//		System.out.println(map.size());
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Raj", 78);
		map1.put("Ankita", 76);
		map1.put("Kunal", 55);
		map1.put("Ankit", 89);
		map1.put("Puneet", 79);
		map1.put("Raju", 78);
		map1.put("Shiva", 56);
		map1.put("Kunal", 85);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Raj", 78);
		map2.put("Ankita", 76);
		map2.put("Kunal", 55);
		map2.put("Ankit", 89);
		map2.put("Puneet", 79);
		map2.put("Raju", 78);
		map2.put("Shiva", 56);
		map2.put("Kunal", 85);
		System.out.println(map2);
		// System.out.println(map.keySet());
//		Set<String> set = map.keySet();
//		for(String key : set) {
//			System.out.println(key+" "+map.get(key));
//		}
		for(String key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}

	}

}











