package vip.hyzt.io.file;

import org.junit.Test;

public class FileDirectoryTests {

    @Test
    public void deleteFile() {
        FileDirectory.deleteFile();
    }

    @Test
    public void deleteDirectory() {
        FileDirectory.deleteDirectory();
    }

    @Test
    public void createDirectory() {
        FileDirectory.createDirectory();
    }

}
