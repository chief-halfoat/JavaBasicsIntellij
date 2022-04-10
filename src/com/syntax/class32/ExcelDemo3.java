package com.syntax.class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo3 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\johna\\Desktop\\Excel Spreadsheets\\Class32A.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xlsx = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xlsx.getSheet("Sheet1");
        System.out.println(xlsx.getSheetIndex("Sheet1"));
        System.out.print(sheet.getRow(0).getCell(0)+" ");
        System.out.println(sheet.getRow(0).getCell(1));
        System.out.println(sheet.getRow(1).getCell(0)+" ");
        System.out.println(sheet.getRow(1).getCell(1));
        System.out.println(sheet.getRow(2).getCell(0)+" ");
        System.out.println(sheet.getRow(2).getCell(1));


        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            for(int j = 0; j<row.getPhysicalNumberOfCells();j++){
                Cell cell = row.getCell(j);
                System.out.println(cell+" ");
            }
        }

    }
}
