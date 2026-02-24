import java.util.ArrayList;

public class linearsearch {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 6, 31, 5, 6};
        int target = 6;
        boolean result = find(arr, target, 0);
        System.out.println(result);
        System.out.println(findIndex(arr, target, 0));
        findm(arr, target, 0);
        System.out.println(list);
    }

    public static boolean find(int arr[], int target, int i) {
        if (i == arr.length) {
            return false;
        }
        return arr[i] == target || find(arr, target, i + 1);
    }

    public static int findIndex(int arr[], int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return findIndex(arr, target, i + 1);
    }

    public static void findm(int arr[], int target, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        findm(arr, target, i + 1);
    }
}
