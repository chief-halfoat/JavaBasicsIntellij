package com.syntax.class31.tasks;
//Create a property file to store following configurations:
//browser=chrome
//url=https://facebook.com
//username
//password
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Task01 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\johna\\Documents\\Batch12\\facebook.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.put("browser","chrome");
        properties.put("url","https://facebook.com");
        properties.put("username","admin");
        properties.put("password","password1");
        properties.store(fileOutputStream,"added info");

        FileInputStream fileInputStream = new FileInputStream((path));
        properties.load(fileInputStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
    }
}
