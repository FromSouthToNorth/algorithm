package vip.hyzt.io.file;

import java.io.File;
import java.io.IOException;

/**
 * 文件创建
 * @author hy
 */
public class FileCreate {

    /**
     * new File(String pathname)
     */
    public static void create1() {
        String path = "E:\\news1.txt";
        File file = new File(path);
        try {
            file.createNewFile();
            System.out.println("create file success!");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * new File(File parent, String child)
     * 根据父目录文件 + 子路径构建
     * e:\\news2.txt
     */
    public static void create2() {
        File file = new File("E:\\");
        String fileName = "news2.txt";
        try {
            // 执行了 createNewFile() 方法才会创建文件
            new File(file, fileName).createNewFile();
            System.out.println("create file success!");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * new File(File parent, String child)
     */
    public static void create3() {
        String parentPath = "E:\\";
        String fileName = "news3.txt";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("create file success!");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
