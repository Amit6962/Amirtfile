package com.vir.model;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Hare h=new Hare();
		Tortoise t=new Tortoise();
		
		Thread t1=new Thread(new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
					h.hareSleep();
						
					}
			
				});
		Thread t2=new Thread(new Runnable()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				t.tortoiseSleep();
			
				
			}
	
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

	}

}
