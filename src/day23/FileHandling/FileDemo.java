package day23.FileHandling;
import java.io.File;
import java.io.IOException;
public class FileDemo {
	public static void main(String[] args) {
		String location = "C:\\Users\\lenovo\\eclipse-workspace\\TECH_RIDERS\\src\\day23\\FileHandling\\Demo1";
		File f = new File(location);
		try {
			if(f.createNewFile()) {
				System.out.println("File Created");
			}
			else {
				System.out.println("File Already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
