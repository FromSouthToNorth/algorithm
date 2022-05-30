package vip.hyzt.io.file;

import java.io.File;

/**
 * 文件目录
 * @author hy
 */
public class FileDirectory {

    /**
     * <p>判断文件是否存在</p>
     * <p>存在则删除</p>
     */
    public static void deleteFile() {
        File file = new File("E:\\news1.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(file.getName() + " 删除成功!");
            }
            else {
                System.out.println(file.getName() + " 删除失败!");
            }
        }
        else {
            System.out.println("该文件不存在!");
        }
    }

    /**
     * <p>删除目录</p>
     */
    public static void deleteDirectory() {
        File file = new File("E:\\demo01");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(file.getName() + " 该目录或文件删除成功!");
            }
            else {
                System.out.println(file.getName() + " 该目录或文件删除失败!");
            }
        }
        else {
            System.out.println("该目录或文件不存在!");
        }
    }

    /**
     * <p>创建多级目录: file.mkdirs()</p>
     * <p>创建一级目录: file.mkdir() </p>
     */
    public static void createDirectory() {
        String directoryPath = "D:\\demo\\a\\b\\c";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(file.getAbsolutePath() + " 该目录存在!");
        }
        else {
            if (file.mkdirs()) {
                System.out.println(file.getAbsolutePath() + " 该目录创建成功!");
            }
            else {
                System.out.println(file.getAbsolutePath() + " 该目录创建失败!");
            }
        }
    }

}
