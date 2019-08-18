package com.vir.model;
import java.util.*;

public class TreeSetEx {

	public static void main(String[] args) {
		int count=0;
		
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("ABC");
		tset.add("String");
		tset.add("Test");
		tset.add("Pen");
		tset.add("INk");
		
		for(String st:tset)
		{
			System.out.println(st);
		}
		
		 ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "A", "D", "A"));
         
	        System.out.println(alphabets);
	         
	        alphabets.retainAll(Collections.singleton("A"));
	        for(String s:alphabets){
	        System.out.println(alphabets);
	        count++;}
	        System.out.println(count);

	}

}
