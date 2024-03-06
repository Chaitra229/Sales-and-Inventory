package com.sales.genericutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {
/**
 * This method will get the path of the external resources from the property files
 * @param Key
 * @return
 * @throws IOException
 */
public String readDataFromPropertyFile(String Key) throws IOException {
	FileInputStream fis=new FileInputStream(IpathConstants.FilePath);
	Properties pobj=new Properties();
	pobj.load(fis);
	String value = pobj.getProperty(Key);
	return value;	
}
}
