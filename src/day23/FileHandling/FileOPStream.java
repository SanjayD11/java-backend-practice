package day23.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

class FileOPStream {
    public static void main(String[] args) {
        String location = "C:\\Users\\lenovo\\eclipse-workspace\\TECH_RIDERS\\src\\day23\\FileHandling\\Demo2.txt";
        File f = new File(location);
        try (FileOutputStream fos = new FileOutputStream(f)) {
            String text = "Hello World!";
            fos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fin = new FileInputStream(f)) {
            int data;
            while ((data = fin.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}