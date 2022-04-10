package com.syntax.class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo7 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\johna\\Desktop\\Excel Spreadsheets\\Class32E.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet1 = xssfWorkbook.getSheetAt(0);
        Row row = sheet1.createRow(6);
        row.createCell(0).setCellValue("Asel");
        row.createCell(1).setCellValue("Kiyatova");
        row.createCell(2).setCellValue("24");
        row.createCell(3).setCellValue("Almaty");
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);

    }
}
