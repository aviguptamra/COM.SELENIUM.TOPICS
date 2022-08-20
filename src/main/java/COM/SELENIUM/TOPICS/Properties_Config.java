package COM.SELENIUM.TOPICS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Properties_Config {

	public static void main(String[] args) throws IOException {


		FileInputStream fis=new FileInputStream("C:\\Users\\Avi Gupta\\eclipse-workspace\\COM.SELENIUM.TOPICS\\Data.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String Username1=prop.getProperty("Username1");
		System.out.println(Username1);
		
		String Password=prop.getProperty("Password");
		System.out.println(Password);
		
		String Username=prop.getProperty("Username");
		System.out.println(Username);
		
	}

}
