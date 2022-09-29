package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping;

import com.github.javafaker.Faker;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ApachePoiTest {
    public static void main(String[] args) throws IOException {
        File file = new File("testfile1.xlsx");
        FileOutputStream fos = new FileOutputStream(file, true);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet sheet = xssfWorkbook.createSheet();
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell1 = row.createCell(0);
        XSSFCell cell2 = row.createCell(1);
        XSSFCell cell3 = row.createCell(2);
        cell1.setCellValue("ime");
        cell2.setCellValue("email");
        cell3.setCellValue("password");

        for (int i = 1; i <= 5; i++) {
            XSSFRow rowLocal = sheet.createRow(i);
            rowLocal.createCell(0);
            rowLocal.createCell(1);
            rowLocal.createCell(2);
            sheet.getRow(i).getCell(0).setCellValue(Faker.instance().name().fullName());
            sheet.getRow(i).getCell(1).setCellValue(Faker.instance().internet().emailAddress());
            sheet.getRow(i).getCell(2).setCellValue(Faker.instance().internet().password());

        }

        xssfWorkbook.write(fos);


    }

    public void citanjeIzFajla(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fis);
        XSSFSheet list1 = hssfWorkbook.getSheetAt(0);
        XSSFRow red1 = list1.getRow(0);
        XSSFCell celija1 = red1.getCell(0);
        //System.out.println(celija1.getStringCellValue());

        for (int i = 1; i <= list1.getLastRowNum(); i++) {
            XSSFRow redI = list1.getRow(i);
            for (int j = 0; j < redI.getLastCellNum(); j++) {
                System.out.print(redI.getCell(j) + " ");
            }
            System.out.println();
        }
    }
}
