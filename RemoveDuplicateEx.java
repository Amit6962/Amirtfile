package com.vir.model;
import java.util.*;

public class RemoveDuplicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
	 
	 System.out.println(numbersList);
	 HashSet<Integer> hashSet = new HashSet<>(numbersList); 
	 
	 ArrayList<Integer> lw=new ArrayList<Integer>(hashSet);
	 
	 System.out.println(lw);
	 

	}

}
