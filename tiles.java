public class tiles {
    public static int pt(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int vertical = pt(n - m, m);
        int horizontal = pt(n - 1, m);
        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(pt(n, m));
    }
}
