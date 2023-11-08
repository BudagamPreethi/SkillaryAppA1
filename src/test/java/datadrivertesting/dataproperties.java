package datadrivertesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class dataproperties {

	public static void main(String[] args) throws IOException {
		//Step1: convert physical file into java readable object
		//new FileInputStream() -->throws FileNotFoundExceptuon
		FileInputStream fis= new FileInputStream("./src/test/resources/data.properties");
		
		//step2: create an instance for properties class
		
		Properties property = new Properties();
		
		//step3: load all key-value pairs from fis to properties object
		
		//property.load(fis)--> throws IOEception
		
		property.load(fis);
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("timeouts"));
		System.out.println(property.getProperty("username"));
		System.out.println(property.getProperty("password"));

	}

}
