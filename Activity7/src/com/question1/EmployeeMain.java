//Author: Gauri Chalak
//sort the elements using comparable

package com.question1;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee(2,"Gauri",10,45000);
		Employee e2=new Employee(5,"Amruta",12,40000);
		Employee e3=new Employee(3,"Dhruv",18,60000);
		Employee e4=new Employee(8,"Viki",15,20000);
		
		ArrayList<Employee> el=new ArrayList<>();
		el.add(e1);				//adding elements to the list
		el.add(e2);
		el.add(e3);
		el.add(e4);
		
		Collections.sort(el);		//sorting the element in ascending order
		for(Employee o:el)
		{
			System.out.println(o.id+" "+o.name+" "+o.age+" "+o.salary);
		}

	}

}