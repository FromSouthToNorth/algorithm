package vip.hyzt.algorithmsFourthEdition.sort;


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

}
