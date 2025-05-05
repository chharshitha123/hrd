package harshitha;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashtableexample {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("D", 500);
System.out.println("After put:"+map);
System.out.println("value for B:"+map.get("B"));
Collection<Integer> values=map.values();
System.out.println("All values:"+values);
System.out.println("Map size:"+map.size());
System.out.println("is map empty?"+map.isEmpty());
Set<String> keys=map.keySet();
map.clear();
System.out.println("after clear():"+map);

	}

}
