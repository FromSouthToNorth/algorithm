package vip.hyzt.I.section_03;

/**
 * <h1>Java 基本类型的最大值和最小值</h1>
 *
 * @author hy
 */
public class TypeMaxMin {

    public static void main(String[] args) {
        System.out.printf("= = = = = = = = = = = = = = %s = = = = = = = = = = = = = = \n", "整型");
        System.out.printf("byte 1字节 取值范围 %d ~ %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short 2字节 取值范围 %d ~ %d\n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int 4字节 取值范围 %d ～ %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long 8字节 取值范围 %d ~ %d\n", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("= = = = = = = = = = = = = = %s = = = = = = = = = = = = = = \n", "浮点型");
        System.out.printf("float 4字节 取值范围 %s ~ %s\n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("double 8字节 取值范围 %s ~ %s\n", Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("= = = = = = = = = = = = = = %s = = = = = = = = = = = = = = \n", "字符型");
        System.out.printf("%c, %c\n", Character.MIN_VALUE, Character.MAX_VALUE);
    }

}
