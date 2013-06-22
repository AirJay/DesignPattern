package decorator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws Exception {
		
		
		InputStream is = new FileInputStream(new File("c:/tmp/my.txt"));
		BufferedInputStream bfi = new BufferedInputStream(is);
		 
		
		int i = bfi.read();
		while (i != -1){
			System.out.print((char)i);
			i=bfi.read();
		}
			
			

	}

}
