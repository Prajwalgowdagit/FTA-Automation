package com.FTAAutomationFinally.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib {
	
public String ReadDataFromProp(String key) throws IOException{
	FileInputStream fis = new FileInputStream("./data/FTAPartnerRequest.properties");
	Properties pobj = new Properties();
	pobj.load(fis);
	String data = pobj.getProperty(key);
	return data;
}
}
