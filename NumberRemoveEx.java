package com.vir.model;
import java.util.*;

import java.util.ArrayList;


public class NumberRemoveEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(4);
		list.add(25);
		list.add(27);
		list.add(29);
		
		
		list.removeIf( num -> num< 25 );
		for(Integer in:list)
		System.out.println(in);

				
	

	}

}
