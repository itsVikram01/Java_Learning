package programs;

import java.util.ArrayList;
import java.util.List;

public class MyArrayStringList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("harsh");
        list.add("harsh");
        list.add("ashwini");
        list.add("ashwini");
        list.add("ashwini");
        list.add("sea");

//        list.stream().forEach(System.out::println);

        list.stream()
                .filter(str -> str.startsWith("h")
                        || str.endsWith("i")
                        || str.matches("sea"))
                //.distinct()
                .sorted() //a-z
                //.sorted(Comparator.naturalOrder()) //a-z
                //.sorted(Comparator.reverseOrder()) //z-a
                .skip(1) // skip desired element from start
                //.findFirst().ifPresent(System.out::println);
                .forEach(System.out::println);





        /*List<String> strs = Arrays.asList("abc", "bcb", "ddc", "bac");
        for(int i = 0; i < strs.size(); i++){
            for(int j = i+1; j < strs.size(); j++){

                String str1 = strs.get(i);
                String str2 = strs.get(j);

                if (str1.length() != str2.length()) {
                    System.out.println(str1 + " and " + str2 + " are not anagram");
                }

                char[] chArr1 = str1.toCharArray();
                char[] chArr2 = str2.toCharArray();

                Arrays.sort(chArr1);
                Arrays.sort(chArr2);

                if (Arrays.equals(chArr1, chArr2)) {
                    out.println(str1 + " and " + str2 + " are Anagram");

                } else {
                    out.println(str1 + " and " + str2 + " are not Anagram");
                }
            }
        }*/


    }
}
