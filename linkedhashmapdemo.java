package harshitha;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmapdemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<>();
		map.put(4, "banana");
		map.put(1, "apple");
		map.put(3, "cherry");
		map.put(5, "oil");
		System.out.println("after put:"+map);
		

	}  

}
