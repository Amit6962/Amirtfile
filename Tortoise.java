package com.vir.model;

public class Tortoise {
	
public void tortoiseSleep()
{
	int val=1;
	while(val<=50)
	{
		System.out.println("Tortoise Stop: "+val);
	try {
		Thread.sleep(250);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	val++;
	}
	}
}
