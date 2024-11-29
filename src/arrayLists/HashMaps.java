package arrayLists;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("nikhil", 29);
		map.put("vasu", 23);
		map.put("hari", 23);
		map.put(null, 3);
		System.out.println(map);
		
		HashMap<String, Object> maps = new HashMap<String, Object>();
		
		maps.put("name", "nikhil");
		maps.put("age", 29);
		maps.put("emps", true);
		maps.put("sal", 23.99);
		maps.put(null, "india");
		System.out.println(maps);
		
		System.out.println(maps.get("name"));
		System.out.println(maps.get("age"));
		System.out.println(maps.get("emps"));
		System.out.println(maps.get("sal"));
		System.out.println(maps.get(null));	
		System.out.println(maps.get("name"));
		
	}

}
