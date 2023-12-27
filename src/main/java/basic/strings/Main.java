package basic.strings;


import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int zero = 0;
        try {
            int result =  44 / zero;
            System.out.println("result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide zero");
        } finally {
            System.out.println("closing resources");
        }
    }

    private static void getUserConfig() {
        try {
            checkedExceptionWithThrows();
        } catch (FileNotFoundException e) {
            System.out.println("user with id: do not have config file in file system");
        }
    }

    private static void checkedExceptionWithThrows() throws FileNotFoundException {
        File file = new File("not_existing_file.txt");
        FileInputStream stream = new FileInputStream(file);
    }

    private static void checkedExceptionWithTryCatch() {
        try {
            File file = new File("not_existing_file.txt");
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("file for additional config not found");
        }
    }
}
