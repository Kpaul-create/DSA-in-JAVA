public class countpath {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(cp(0, 0, n, m));
    }

    public static int cp(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int right = cp(i, j + 1, n, m);
        int down = cp(i + 1, j, n, m);
        return right + down;
    }
}
