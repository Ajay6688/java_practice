package exception_learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionLearning {

	public static void main(String a[]){
		try {
			openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
			e.printStackTrace();
		}
	}
	
	public static void openFile()throws FileNotFoundException {
		String filePath = "C:/Users/RSTPL0133/Desktop/test.txt";
		File file = new File(filePath);
		
		FileReader fileReader = new FileReader(file);
		
	}
}
