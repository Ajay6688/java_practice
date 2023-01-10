package read_write_files;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		
		try {
			String filePath = "C:/Users/RSTPL0133/Desktop/test.txt" , line;
			File file = new File(filePath);
			Scanner scan = new Scanner(file);
			
			while(scan.hasNextLine()) {
			     line = scan.nextLine();
				System.out.println(line);
				
			}
			scan.close();
			
		} catch (Exception e) {
			System.out.println("exception happend");
			e.printStackTrace();
		}
		
	}

}
