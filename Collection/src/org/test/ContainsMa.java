package org.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class ContainsMa {

	public static void main(String[] args) {

		Map<Integer, Object> m = new HashMap<>();
		// key,value//out put is random order
		m.put(1, 50);// key not allow duplicate,it will override.
		m.put(null, 50);// value allow duplicate and null
		m.put(3, 45);// key will allow single null
		m.put(8, null);
		m.put(6, null);
		m.put(3, 15);
		m.put(2, 20);
		m.put(null, "Hello");

		System.out.println(m);

		
		Object object = m.get(8);
		System.out.println(object);

		Boolean contains = m.containsValue(20);
		System.out.println(contains);

		Boolean bool = m.containsKey(20);
		System.out.println(bool);
		m.put(16, 22);
		System.out.println(m);

		int size = m.size();
		System.out.println(size);

		Collection<Object> values = m.values();
		System.out.println(values);

	}

}
