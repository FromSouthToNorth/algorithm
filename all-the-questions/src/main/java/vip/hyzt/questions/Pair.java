package vip.hyzt.questions;

public class Pair {

    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return (int) ((long) x << 20 | y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            return x == pair.x && y == pair.y;
        }
        return false;
    }
}
