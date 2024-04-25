package com.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import com.TestBase.BaseClass;

public class PropertyUtils {
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger(BaseClass.class);

	public static String readProperty(String key) throws IOException {
		log.info("Reading Value Of Key From Property File");
		Properties prop = new Properties();
		try {

			fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");

			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		log.info("Value Found in The Property File For Given Key : " + key);
		return prop.getProperty(key);
	}
}
