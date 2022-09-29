package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ApachePoiTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fajl.xlsx");
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
