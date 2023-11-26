package com.example.dev.files;

import org.apache.commons.io.FilenameUtils;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

    public static void main(String[] args) {

        /*String fullPath = "/Users/akshathsaipittala/Movies/Tag (2018) [BluRay] [1080p] [YTS.AM]/Tag.2018.1080p.BluRay.x264-[YTS.AM].mp4";

        // Create a Path object
        Path path = Paths.get(fullPath);

        // Get the file name
        String fileName = path.getFileName().toString();
        System.out.println("File Name: " + fileName);

        // Get the directory path
        String directoryPath = path.getParent().toString();
        System.out.println("Directory Path: " + directoryPath);*/

        String fileName2 = "SIT2DEM1_TRDRP001_RecPurchase-EOD-Rpt_2023117000001_001.xlsx";
        String extension = FilenameUtils.getExtension(fileName2);

        String[] parts = new String[2];
        parts = fileName2.split("_");
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(extension);
        /*for (String part: parts) {
            System.out.println(part);
        }*/
        if (fileName2.contains("TRDRP001")) {
            System.out.println(true);
        }

    }
}
