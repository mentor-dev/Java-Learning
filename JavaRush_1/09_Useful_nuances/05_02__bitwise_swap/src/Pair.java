public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        // x ^= y ^= x ^= y;

        // x = x ^ (y = y ^ (x = x ^ y));
        
        // x = x ^ y;
        // y = y ^ x;
        // x = x ^ y;

        x ^= y;
        y ^= x;
        x ^= y;
    }
}