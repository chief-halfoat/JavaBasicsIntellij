package com.syntax.class32;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\johna\\Desktop\\Excel Spreadsheets\\Class32D.xlsx";
        List<Map<String, String>> excelData=ExcelReader.getData(path);
        System.out.println(excelData.get(1).get("FirstName"));
        System.out.println(excelData.get(4).get("Age"));
    }
}
