package programs.collectionFramework.list.arrayList;

public class ArrayElementsNthPositionValue {
    public static void main(String[] args) {
        /*int [] arr = {0,1,1,2,4,7,13,24,44,81,149,274,...,n};*/

        int n = 10000;

        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            if (i == 0) {
                arr[i] = 0;
            } else if (i == 1) {
                arr[i] = 1;
            } else if (i == 2) {
                arr[i] = arr[0] + arr[1];
            } else {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
        }
        System.out.println(n + " element index value is : " + (n - 1) + " and it's position value is : " + arr[n - 1]);

    }
}
