package org.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ContainsSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Object> s = new HashSet<>();

s.add(2);
s.add(2);
s.add(null);
s.add(null);
s.add(10.5);
s.add("Suganya");
s.add(60);

System.out.println(s);


s.add(4);
System.out.println(s);

Boolean bool = s.contains(2);
System.out.println(bool);

Object size = s.size();
System.out.println(size);

s.remove(60);
System.out.println(s);

s.clear();
System.out.println(s);

Set<Object> li = new LinkedHashSet<>();

li.add(0);
li.add(null);
li.add(null);
li.add("hello");

System.out.println(li);

Set<Object> t = new TreeSet<>();

t.add(5);
t.add(15);
t.add(10);
t.add(15);



System.out.println(t);

	}
}


