package com.syntax.class33;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\johna\\Desktop\\Excel Spreadsheets\\Class32D.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        System.out.println(xssfWorkbook.getSheetIndex("Sheet1"));
        System.out.println(sheet.getRow(1).getCell(0));
        System.out.println(sheet.getRow(1).getCell(1));

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            for (int j=0; j<row.getPhysicalNumberOfCells();j++){
                Cell cell = row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }
}
