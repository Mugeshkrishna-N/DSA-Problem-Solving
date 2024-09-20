import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println("");
        System.out.println("Enter number of rotations");
        int k = sc.nextInt();
        k = k % n;
        for (i = 0, j = n - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for (i = 0, j = k - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for (i = k, j = n - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for (i = 0; i < n; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}
