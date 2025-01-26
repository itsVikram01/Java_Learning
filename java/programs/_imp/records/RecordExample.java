package java._imp.records;

// record in Java is a special kind of class introduced in Java 14 as a preview feature (and made permanent in Java 16).
// Records are a quick way to create classes that are meant to hold immutable data.

import java.util.List;

/* Basic Record */
record Person(String name, int age) {
    /*The Java compiler generates the following:
        A constructor: public Person(String name, int age)
        Getter methods: public String name() and public int age()
        equals(), hashCode(), and toString() methods.*/
}

/* Adding Methods to a Record */
record Rectangle(double length, double width) {
    public double area() {
        return length * width;
    }
}

/* Validation with Compact Constructor */
record Temperature(double value) {
    // Compact constructor for validation
    public Temperature {
        if (value < -273.15) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero!");
        }
    }
}

/* Nested Records */
record Address(String street, String city) {
}

record Employee(String name, Address address) {
}

/* Records and Collections */
record Book(String title, String author) {
}

public class RecordExample {
    public static void main(String[] args) {

        Person person = new Person("Alice", 30);
        // Access fields using auto-generated getter methods
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        // Auto-generated toString() method
        System.out.println("Person Details: " + person);
        // Auto-generated equals() and hashCode()
        Person anotherPerson = new Person("Alice", 30);
        System.out.println("Are they equal? " + person.equals(anotherPerson)); // true


        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle Area: " + rectangle.area());


        Temperature validTemp = new Temperature(25.0);
        System.out.println("Temperature: " + validTemp.value());
        // This will throw an exception
        // Temperature invalidTemp = new Temperature(-300.0);


        Address address = new Address("123 Main St", "Springfield");
        Employee employee = new Employee("John Doe", address);
        System.out.println("Employee Name: " + employee.name());
        System.out.println("Employee Address: " + employee.address());
        System.out.println("Employee City: " + employee.address().city());

        List<Book> books = List.of(
                new Book("1984", "George Orwell"),
                new Book("To Kill a Mockingbird", "Harper Lee"),
                new Book("The Great Gatsby", "F. Scott Fitzgerald")
        );
        books.forEach(System.out::println);
    }
}
