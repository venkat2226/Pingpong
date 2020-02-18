package sample;

import java.io.File;
import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) throws Exception {
	    // pass the path to the file as a parameter 
		try {
	    File file =  new File(System.getProperty("user.dir")+"/Sampleresource/help.txt");
	    Scanner sc = new Scanner(file); 
	     while (sc.hasNextLine()) 
	      System.out.println(sc.nextLine());
	     System.out.println("King needed");
          //Thread.sleep(10000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
