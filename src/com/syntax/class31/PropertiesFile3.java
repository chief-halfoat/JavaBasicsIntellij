package com.syntax.class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile3 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\johna\\Documents\\Batch12\\potus.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();

        properties.put("IsCrazy","true");
        properties.put("isRich","false");

        properties.store(fileOutputStream,"added some new fields");
    }
}
