package com.vir.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
			FileReader fr=new FileReader("src/com/vir/model/abc.txt");
			FileWriter fw=new FileWriter("src/com/vir/model/abc2.txt");
			int ch=0;
			while(ch!=-1)
			{
				ch=fr.read();
				
				if(ch== -1) break;
				fw.write(ch);
			}
			fr.close();
			fw.close();
			System.out.println("file copied");
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
