package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAFile {

    public static void countLines() {
        File file = new File("src/com/company/Words");
        int counter = 0;

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        System.out.println(counter);
    }

}
