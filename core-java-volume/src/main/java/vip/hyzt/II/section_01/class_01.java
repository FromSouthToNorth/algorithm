package vip.hyzt.II.section_01;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class class_01 {

    public static void main(String[] args) {
        try {
            String path = "../../../../../main/resources/class_01.txt";
            String contents = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
            System.out.printf("%s\n", contents);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
