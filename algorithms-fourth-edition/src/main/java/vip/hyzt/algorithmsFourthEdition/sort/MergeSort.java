package vip.hyzt.algorithmsFourthEdition.sort;

/**
 * <h3>归并排序</h3>
 * @author hy
 */
public class MergeSort {
    private int[] aux;

    public void sort(int[] array) {
        int n = array.length;
        aux = new int[n];
        sort(array, 0, n - 1);
    }

    private void sort(int[] array, int lo, int hi) {
        if (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            sort(array, lo, mid);
            sort(array, mid + 1, hi);
            merge(array, lo, mid, hi);
        }
    }

    private void merge(int[] array, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            aux[k] = array[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                array[k] = aux[j++];
            }
            else if (j > hi) {
                array[k] = aux[i++];
            }
            else if (aux[j] < aux[i]) {
                array[k] = aux[j++];
            }
            else {
                array[k] = aux[i++];
            }
        }
    }


}
