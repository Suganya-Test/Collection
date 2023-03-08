package org.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {

		List<Object> li = new LinkedList<>();

		li.add(10);
		li.add(30);
		li.add(30.5);
		li.add(78);
		li.add(78);
		li.add(null);
		li.add('s');
		li.add("Hello");

		System.out.println(li);
		
		li.add(4, 'a');
		System.out.println(li);

		Object bool = li.contains(78);
		System.out.println(bool);

		Object object = li.get(4);
		System.out.println(object);

		li.remove(2);
		System.out.println(li);

		Object size = li.size();
		System.out.println(size);
		
		li.clear();
		System.out.println(li);
		
		List<Object> a = new ArrayList<>();
		a.add(2);
		a.add(40);
		a.add(50.5);
		a.add(null);
		System.out.println(a);
	}

}
