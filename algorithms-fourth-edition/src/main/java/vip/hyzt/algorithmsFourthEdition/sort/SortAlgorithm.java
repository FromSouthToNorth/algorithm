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
     * 想要使用 JCF 列表的算法的辅助方法
     * @param elements - a list should be sorted
     * @return a sorted list
     * @param <T> element type
     */
    @SuppressWarnings("unchecked")
    default <T extends Comparable<T>> List<T> sort(List<T> elements) {
        return Arrays.asList(sort(elements.toArray((T[]) new Comparable[elements.size()])));
    }

}
