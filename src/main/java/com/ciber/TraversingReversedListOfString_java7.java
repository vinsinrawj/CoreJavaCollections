package com.ciber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TraversingReversedListOfString_java7 {
	static List<String> empList = new ArrayList<String>(Arrays.asList("A","C","B"));
	
	public static void main(String[] args) {
		System.out.println("List Traversal Java7");
		for(String employee: empList) {
			System.out.print(employee+"; ");
		}
		
		System.out.println();
		Iterator<String> itr = empList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"; ");
		}
		
		System.out.println();
		Collections.sort(empList);
		System.out.println(empList);
		
		System.out.println();
		Iterator<String> itr2 = empList.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+"; ");
		}
		
		System.out.println("Using Lambda expression and method reference");
		//Looping List using Java8 foreach+Lambda expression or method reference
		empList.forEach(employee -> System.out.print(employee+"; "));
		System.out.println();
		empList.forEach(System.out::print);
		
		System.out.println();
		System.out.println("Using Streams");
		empList.stream().forEachOrdered(employee -> System.out.print(employee+"; "));
		System.out.println();
		empList.stream().forEachOrdered(System.out::print);
		
		System.out.println();
		
	}
}
