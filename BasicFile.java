package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class BasicFile {

	public static void main(String[] args) {

		
		File file=new File("D://FileEx/basic.txt");
		
		try {
			if(!file.exists()) {
			file.createNewFile();
			System.out.println("file created...");
			}
			FileWriter writ=new FileWriter(file);
			writ.write("hai hello welcome...");
			writ.write("\n");
			writ.write(" welcome guhan ...");
			
			writ.close();
			
		}
		catch(Exception e) {
			
		}
		try {
			
			FileReader red=new FileReader(file);
		/*	Scanner scan=new Scanner(red);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			*/
			BufferedReader redBuf=new BufferedReader(red);
			//System.out.println(redBuf.readLine());
			//System.out.println(redBuf.readLine());
			String word="ddd";
			System.out.println(word.hashCode());
			while((word=redBuf.readLine())!=null) {
				System.out.println(word);
				System.out.println(word.hashCode());

			}
				
			
			red.close();
		}
		catch(Exception e) {
			
		}
	}

}
