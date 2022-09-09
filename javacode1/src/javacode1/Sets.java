package javacode1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;


public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Set<Integer> a=new HashSet<Integer>();
     a.add(1);
     a.add(2);
     a.add(-3);
     a.add(0);
     a.add(11);
     a.remove(2);
     a.size();
     int len=a.size();
     System.out.println(a);
     System.out.println("the size of the set is:"+len);
   //tree set
     TreeSet<Integer> b=new TreeSet<Integer>();
     b.add(9);
     b.add(2);
     b.add(-3);
     b.add(0);
     b.add(11);
     b.remove(2);
     System.out.println(b);
     //linked list
     LinkedList<Integer> c=new LinkedList<Integer>();
     c.add(9);
     c.add(2);
     c.add(-3);
     c.add(0);
     c.add(11);
     c.remove(2);
     c.set(2, 6);
     System.out.println(c);
     System.out.println("the ele dat r relaced r:"+c.set(2, 6));
     //array list
     ArrayList<Integer> d=new ArrayList<Integer>();
     d.add(9);
     d.add(2);
     d.add(-3);
     d.add(0);
     d.add(11);
     d.remove(2);
     d.set(2, 6);
     d.subList(0,3);
     System.out.println(d);
     System.out.println("the sublist is:"+d.subList(0,3));
     
	}
	

}

