package programs.collectionFramework.list.arrayList;

public class PairOfElementProductEqualsToGivenNoInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int givenNumber = 12;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] == givenNumber) {
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }

        /**************************************** Using java 8 ***************************************************/

        /*IntStream.range(0, arr.length)
                .mapToObj(i -> IntStream.range(i + 1, arr.length)
                        .mapToObj(j -> new int[] {arr[i], arr[j]})) // Create stream of int arrays
                .flatMap(pairStream -> pairStream) // Flatten the stream of streams
                .filter(pair -> pair[0] * pair[1] == givenNumber)
                .forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));*/

    }
}
