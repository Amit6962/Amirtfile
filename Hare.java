package com.vir.model;

public class Hare {
	
	public void hareSleep()
	{
		int val=1;
			while(val<=30){
			System.out.println("Hare Stop:"+val);
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		val++;
			}
		if(val>30)
		{
			System.out.println("Hare Stop:"+val);
			
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
