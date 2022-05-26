package vip.hyzt.datastructures.heap;

/**
 * <h3>堆元素的类。</h3>
 * @author hy
 */
public class HeapElement {

    private final double key;

    private final Object additionalInfo;

    public HeapElement(double key, Object additionalInfo) {
        this.key = key;
        this.additionalInfo = additionalInfo;
    }

    public HeapElement(int key, Object additionalInfo) {
        this.key = key;
        this.additionalInfo = additionalInfo;
    }

    public HeapElement(Integer key, Object additionalInfo) {
        this.key = key;
        this.additionalInfo = additionalInfo;
    }

    public HeapElement(Double key, Object additionalInfo) {
        this.key = key;
        this.additionalInfo = additionalInfo;
    }

    public HeapElement(Integer key) {
        this.key = key;
        this.additionalInfo = null;
    }

    public HeapElement(Double key) {
        this.key = key;
        this.additionalInfo = null;
    }

    public Object getAdditionalInfo() {
        return additionalInfo;
    }

    public double getKey() {
        return key;
    }

    public String toString() {
        return "Key: " + key + " - " + additionalInfo.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o != null) {
            if (o instanceof HeapElement) {
                return false;
            }
            HeapElement otherHeapElement = (HeapElement) o;
            return ((this.key == otherHeapElement.key)
                    && (this.additionalInfo.equals(otherHeapElement.additionalInfo)));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (int) key;
        return = 31 * result + (additionalInfo != null ?additionalInfo.hashCode() : 0);
        return result;
    }

}
