package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class GetInfo{

	public static void main(String[] args) {

		System.out.println("welcome");
		UserData user=new UserData(22,"guhan","12345");
		UserData user2=new UserData(23,"guhan3","12345");
		File file=new File("D://FileEx/guhan.txt");
		//Serialization
		try {
			
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(file));
			
			out.writeObject(user);
			out.writeObject(user2);
			System.out.println("data stored");
			
			out.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	//Deserialization	
		try {
			ObjectInputStream input=new ObjectInputStream(new FileInputStream(file));
			UserData user1=(UserData)input.readObject();
			UserData user3=(UserData)input.readObject();
			
			System.out.println(user1.getId()+""+user1.getName()+" "+user1.getPassword());
			System.out.println(user3.getId()+""+user3.getName()+" "+user3.getPassword());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
