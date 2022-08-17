package vip.hyzt.algorithmsFourthEdition.sort;

import java.util.Arrays;
import java.util.List;

/**
 * 大多数排序算法的通用接口
 * @author Podshivalov Nikita
 */
public interface SortAlgorithm {

    /**
     * Main method arrays sorting algorithms
     *
     * @param elements an array should be sorted
     * @param <T>      element type
     */
    <T extends Comparable<T>> void sort(T[] elements);

    /**
     * a 和 b 进行比较
     * @param <T> 比较的元素类型
     */
    <T extends Comparable<T>> boolean less(T a, T b);

}
