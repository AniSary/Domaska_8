import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[15];
        for (int i = 0; i < 15; i++) a[i] = (int) (Math.random() * 100) + 1;
        System.out.println(Arrays.toString(a));

        //(Insertion Sort) вроде я понял как оно работает
        for (int i = 1; i < 15; i++) {
            int k = a[i], j = i - 1;
            while (j >= 0 && a[j] > k) { a[j + 1] = a[j]; j--; }
            a[j + 1] = k;
        }
        System.out.println(Arrays.toString(a));

        System.out.print("Введіть число: ");
        int x = new Scanner(System.in).nextInt();

        int l = 0, r = 14, res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x) { res = m; break; }
            if (a[m] < x) l = m + 1; else r = m - 1;
        }
        System.out.println(res == -1 ? "Числа немає" : "Індекс: " + res);
    }
}