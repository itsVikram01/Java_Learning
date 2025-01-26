package java.interfaces.comparator;

import lombok.Data;

@Data
public class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}