package read_write_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String a[]) {
		try {
			
			// file writer takes two parameters file path and boolean . true means adding the string without erasing the previous data
			FileWriter fr = new FileWriter("C:/Users/RSTPL0133/Desktop/test1.txt" , true);
			BufferedWriter br = new BufferedWriter(fr);
			br.write("These are the exceptions that are checked at compile time. If some code within a method throws a checked exception, then the method must either handle the exception or it must specify the exception using the throws keyword. In checked exception, there are two types: fully checked and partially checked exceptions. A fully checked exception is a checked exception where all its child classes are also checked, like IOException, InterruptedException. A partially checked exception is a checked exception where some of its child classes are unchecked, like Exception.\r\n"
					+ "\r\n"
					+ "For example, consider the following Java program that opens the file at location “C:\\test\\a.txt” and prints the first three lines of it. The program doesn’t compile, because the function main() uses FileReader() and FileReader() throws a checked exception FileNotFoundException. It also uses readLine() and close() methods, and these methods also throw checked exception");
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
