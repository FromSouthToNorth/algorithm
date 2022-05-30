package vip.hyzt.io.file;

import java.io.File;

/**
 * 获取文件信息
 * @author hy
 */
public class FileInformation {

    public static void getFileInfo() {

        File file = new File("E:\\news1.txt");

        // 获取文件名称：
        String fileName = file.getName();
        System.out.printf("file name: `%s` \n", fileName);

        // 获取文件绝对路径
        String absolutePath = file.getAbsolutePath();
        System.out.printf("file absolute path: `%s` \n", absolutePath);

        // 获取文件父目录
        String parent = file.getParent();
        System.out.printf("file parent path: `%s` \n", parent);

        // 获取文件大小
        long length = file.length();
        System.out.printf("file length: `%d` \n", length);

        // 文件是否存在
        boolean exists = file.exists();
        System.out.printf("file exists: `%b` \n", exists);

        // 是否是文件
        boolean isFile = file.isFile();
        System.out.printf("file isFile: `%b` \n", isFile);

        // 是否是目录
        boolean directory = file.isDirectory();
        System.out.printf("file isDirectory: `%b` \n", directory);

    }

}
