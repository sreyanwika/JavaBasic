package javacode1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapsHashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map a=new HashMap();
    a.put("hey","hloo");
    a.put("hoo","hurrey");
    a.put("zero",0);
    a.put("hy",9);
    a.put("call", 9);
    a.containsValue(0);
    a.containsKey("hy");
    System.out.println(a);
    System.out.println(a.get("hey"));
    System.out.println(a.values());
    System.out.println(a.containsValue(0));
    for (int b=0;b<=a.size()-1;b++) {
     System.out.println("the values that are occured no of tymes are"+a);
    }
    //tree map
    Map b=new TreeMap();
    b.put("hey","hloo");
    b.put("hoo","hurrey");
    b.put("zero",0);
    b.put("hy","9");
    System.out.println(b);
    b.isEmpty();
    System.out.println(b.isEmpty());
 // Get a set of the entries
    Set set = b.entrySet();
    // Get an iterator
    Iterator i = set.iterator();
    // Display elements
    while(i.hasNext()) {
       Map.Entry be = (Map.Entry)i.next();
       System.out.print(be.getKey() + ": ");
       System.out.println(be.getValue());
    }
    System.out.println();
    //linked hash map
    Map c=new LinkedHashMap();
    c.put("hey","hloo");
    c.put("hoo","hurrey");
    c.put("zero",0);
    c.put("hy","9");
    System.out.println(c);
    c.isEmpty();
    System.out.println(b.isEmpty());
 // Get a set of the entries
    Set set1 = c.entrySet();
    // Get an iterator
    Iterator m = set.iterator();
    // Display elements
    while(m.hasNext()) {
       Map.Entry bet = (Map.Entry)m.next();
       System.out.print(bet.getKey() + ": ");
       System.out.println(bet.getValue());
    }
    System.out.println();
    c.clear();
    System.out.println(c);
    //converting array to map and counting the repeating values.... 
    Map<String, int[]> map = new TreeMap<String, int[]>();

    int[] array = new int[4];
    array[0] = 0;
    array[1] = 1;
    array[2] = 2;
    array[3] = 0;
    map.put("array", array);

    Iterator<String> iter = map.keySet().iterator();

    while (iter.hasNext()) {
      String arrayName = iter.next();
      array = map.get(arrayName);
      System.out.print(arrayName + ":");
      int count=0;
      for (int l = 0; l < array.length; l++) {
    	  if(array[l]==0) {
    		  count++;
    		  System.out.println(array[l]+" "+count);  
    	  }
    }
      
	}
    //creating an array inside the map and counting characters
    Map s=new HashMap();
    String name="heyy here iam to inform you that i am sreyanwika";
    for(char n:name.toCharArray()) {
    	if(s.containsKey(n)) {
    		int count=(int)s.get(n);
    		s.put(n,count+1);
    		
      	}
    	else {
    		s.put(n, 1);
    	}
    }
    s.remove('a');
    System.out.println(s);
    
	}
}
