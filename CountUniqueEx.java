package com.vir.model;
import java.util.*;

public class CountUniqueEx {
	
	public static void countOccurs(ArrayList<Integer> list)
	{
		HashSet<Integer> hset=new HashSet<Integer>(list);
		
		for(Integer in:hset)
		{
			 System.out.println(in + " occurs : " +Collections.frequency(list, in)); 
	    } 
		}
		
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(4);
		
		countOccurs(list);
		

	}

}
