package com.syntax.class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

public class ExcelDemo6 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\johna\\Desktop\\Excel Spreadsheets\\Class32D.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet1 = xssfWorkbook.getSheet("Sheet1");

        List<Map<String, String>> excelData=new ArrayList<>();
        Row headerRow = sheet1.getRow(0);
        for (int j = 1; j < sheet1.getPhysicalNumberOfRows(); j++) {
            Row row = sheet1.getRow(j);
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                linkedHashMap.put(headerRow.getCell(i).toString(),row.getCell(i).toString());
            }
            excelData.add(linkedHashMap);
        }
        System.out.println(excelData);
    }
}