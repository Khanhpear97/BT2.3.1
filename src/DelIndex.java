import java.util.Arrays;
import java.util.Scanner;

public class DelIndex {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vi tri can xoa: ");
        int delIndex = scanner.nextInt();
        arr = remove(arr, delIndex);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] remove(int[] array, int index) {
        int n = array.length;
        if (index >= n) {
            return array;
        }
        int[] result = new int[n - 1];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (i == index) {
                continue;
            }
            result[k] = array[i];
            k++;
        }
        return result;
    }
}
