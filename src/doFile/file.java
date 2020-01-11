package doFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			human in = new human();
			in.setName("neil");
			in.setAddress("Makti");
		
			//make file
			try { 
				FileOutputStream fos = new FileOutputStream("C:\\Users\\Vivian\\Desktop\\hello.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(in); 
				oos.close(); 
				fos.close(); 

			} catch(Exception e) {
				e.printStackTrace(); 
			}
		
			//print the text from file
			try {

				FileInputStream fis = new FileInputStream("C:\\Users\\Vivian\\Desktop\\hello.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				human info = (human) ois.readObject();
				ois.close();
				fis.close();
				System.out.println("Name: " + info.getName());
				System.out.println("Lastname: " + info.getAddress());

			} catch (Exception e) {

			}
		}
}
