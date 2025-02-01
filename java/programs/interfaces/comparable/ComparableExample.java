package programs.interfaces.comparable;

import java.util.Arrays;

public class ComparableExample {
    public static void main(String[] args) {
        Student[] arr = {new Student(111, "AAA", 23),
                new Student(131, "BBB", 22),
                new Student(121, "CCC", 24)};

        Arrays.sort(arr);

        for (Student st : arr) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
