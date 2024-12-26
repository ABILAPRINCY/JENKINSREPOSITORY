package Generic_Uilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Utility {

	/**
	 * This method is used to read data from properties_file (External Resource)
	 * @param Key
	 * @return
	 * @author Shobha
	 * @throws Throwable
	 */
	public String getKeyAndValuePair(String Key) throws Throwable {

		FileInputStream fis1 = new FileInputStream("D:\\PRINCY\\SeleniumFiles\\ReadData1.xlsx");
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(Key);
		return value;

	}
}
