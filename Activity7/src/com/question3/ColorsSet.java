//Author:Gauri Chalak
//To create a unique color set and perform tree set operations

package com.question3;

import java.util.Iterator;
import java.util.TreeSet;
public class ColorsSet {

	public static void main(String[] args) {

		TreeSet<String> t1=new TreeSet<>();
		t1.add("Pink");
		t1.add("Orange");
		t1.add("Yellow");
		t1.add("Purple");
		t1.add("Blue");
		for (String s:t1)  // adding colors
		{
			System.out.println(s);
		}
	
		System.out.println("--------------");
		
		TreeSet<String> t2=new TreeSet<>();
		t2.add("Blue");
		t2.add("Red");
		t2.add("Green");
		t2.addAll(t1);     //adding all the elements of a specified tree set to another tree set
		for(String s:t2)
		{
			System.out.println(s);
		}
		
		System.out.println("--------------");
		
		Iterator it=t2.descendingIterator(); //a reverse order view of the elements
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("--------------");
		
		// comparing first TreeSet to another
        // using equals() method
		 boolean value
         = t1.equals(t2);
		 System.out.println("Are both set equal: "
                 + value);
		 
    System.out.println("--------------"); //the first and last elements in a tree set

   System.out.println("first element in set is :"+t2.first());  
   System.out.println("last element in set is :"+t2.last());
    
		
		
	}
	
}
