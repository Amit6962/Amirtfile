package com.vir.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("src/abc.txt");
			FileWriter fw=new FileWriter("src/Sumofabc.txt");
			BufferedReader br=new BufferedReader(fr);
			int sum=0;
			
			while(true)
			{
				String s1=br.readLine();
				if(s1==null)
					break;
				else
				{
					Scanner sc=new Scanner(s1);
					while(sc.hasNext())
					{
						int x=sc.nextInt();
						sum=sum+x;
					}
					fw.write("sum="+sum+"\n");
					System.out.println(sum);
					sc.close();
				}
			}
			fr.close();
			fw.close();
			System.out.println("Sum completed");
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
