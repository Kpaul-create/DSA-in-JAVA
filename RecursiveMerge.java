import java.util.Arrays;

public class RecursiveMerge {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8, 1, 7 };
        arr = MS(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static int[] MS(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] l = MS(Arrays.copyOfRange(arr, 0, mid));
        int[] r = MS(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(l, r);
    }

    public static int[] merge(int[] first, int[] second) {
        int mix[] = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // It may be possible that one of the array is not complete so copy remaining
        // elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}