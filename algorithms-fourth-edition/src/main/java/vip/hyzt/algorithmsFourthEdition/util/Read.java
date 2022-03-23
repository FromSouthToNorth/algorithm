package vip.hyzt.algorithmsFourthEdition.util;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 读取文件
 *
 * @author hy
 */
public class Read {

    /**
     * 假设 Unicode UTF-8 编码
     */
    private static final String CHARSET_NAME = "UTF-8";

    /**
     * 假设语言 = 英语，国家 = 美国，以便与 System.out 保持一致。
     */
    private static final Locale LOCALE = Locale.US;

    /**
     * 默认标记分隔符；我们保持这个值的不变量
     * 在调用之间由扫描仪的分隔符保存
     */
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\p{javaWhitespace}+");

    /**
     * 用于读取整个输入。资源：
     */
    private static final Pattern EVERYTHING_PATTERN = Pattern.compile("\\A");

    private Scanner scanner;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Read() {
        scanner = new Scanner(new BufferedInputStream(System.in), CHARSET_NAME);
        scanner.useLocale(LOCALE);
    }

    public Read(String name) {
        if (name == null) {
            throw new IllegalArgumentException("argument is null");
        }
        if (name.length() == 0) {
            throw new IllegalArgumentException("argument is the empty string");
        }

        try {
            // 首先尝试从本地文件系统读取文件
            File file = new File(name);
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                scanner = new Scanner(new BufferedInputStream(fis), CHARSET_NAME);
                scanner.useLocale(LOCALE);
                return;
            }
            // 相对于 .class 文件的资源
            URL url = getClass().getResource(name);

            // 相对于类加载器根的资源
            if (url == null) {
                url = getClass().getClassLoader().getResource(name);
            }

            // 或来自网络的 URL
            if (url == null) {
                url = new URL(name);
            }

            URLConnection site = url.openConnection();
            InputStream is = site.getInputStream();
            scanner = new Scanner(new BufferedInputStream(is), CHARSET_NAME);
            scanner.useLocale(LOCALE);
        }
        catch (IOException e) {
            throw new IllegalArgumentException("Could not open " + name, e);
        }
    }

    public String readAll() {
        if (!scanner.hasNextLine()) {
            return "";
        }
        String result = scanner.useDelimiter(EVERYTHING_PATTERN).next();
        scanner.useDelimiter(WHITESPACE_PATTERN);
        return result;
    }

    public String[] readAllString() {
        String[] tokens = WHITESPACE_PATTERN.split(readAll());
        if (tokens.length == 0 || tokens[0].length() > 0) {
            return tokens;
        }
        String[] decapitokens = new String[tokens.length - 1];
        for (int i = 0; i < tokens.length - 1; i++) {
            decapitokens[i] = tokens[i+1];
        }
        return decapitokens;
    }

    public Integer[] readAllInteger() {
        String[] fields = readAllString();
        Integer[] vals = new Integer[fields.length];
        for (int i = 0; i < fields.length; i++) {
            vals[i] = Integer.parseInt(fields[i]);
        }
        return vals;
    }

}
