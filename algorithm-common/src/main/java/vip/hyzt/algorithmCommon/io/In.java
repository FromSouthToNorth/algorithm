package vip.hyzt.algorithmCommon.io;

import java.io.File;
import java.net.URL;

/**
 * <p>读入文件</p>
 * @author hy
 */
public class In {

    public In(String name) {
        if (name == null) {
            throw new IllegalArgumentException("argument null");
        }
        if (name.length() == 0) {
            throw new IllegalArgumentException("argument the empty string");
        }

        System.out.println(name);

        File file = new File(name);

        System.out.println(file);

        if (file.exists()) {

        }

        URL url = getClass().getResource(name);
        System.out.println(url);
    }
}
