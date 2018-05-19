/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class File1 {

   private static Scanner r;
    public static void main(String[] args) {
         try {
			
			File file = new File ("splitstring.txt");
			FileWriter fw = new FileWriter(file);
		Scanner myscanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = myscanner.nextLine();
		fw.write("\n"+name);
		System.out.print("Enter your id: ");
		String id = myscanner.nextLine();
		fw.write("\n"+id);
		System.out.print("Enter first subject and marks: ");
		String firstnumber = myscanner.nextLine();
		fw.write("\n"+firstnumber);
		System.out.print("Enter second subject and marks: ");
		String secondnumber = myscanner.nextLine();
		fw.write("\n"+secondnumber);
		System.out.print("Enter third subject and marks: ");
		String thirdnumber = myscanner.nextLine();
		fw.write("\n"+thirdnumber);
     	fw.close();
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
		
		Double sum =0.0;
		short count = 0;
		
		try {
			
			File readfile = new File("splitstring.txt");
			r = new Scanner(readfile);
			String str;
                        
			while(r.hasNextLine())
			{
				str = r.nextLine();
				int part[] = new int[str.length()];
				if(part.length == 2)
				{
					count++;
					sum+= Double.parseDouble(str);
                                        
				}
			}
                        File fi = new File("output.txt");
                        FileWriter fe = new FileWriter(fi);
                        Double Avg = sum/count;
                        String avg = String.valueOf(Avg);
                        fe.write(avg);
                            
			System.out.print("Average is "+Avg);
                        fe.close(); 
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
    }
    
}
