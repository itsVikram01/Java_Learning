package programs.java21.patternMatchingForSwitch_finalized;

public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = "Hello, Java 21";

        /*String result = switch (obj) {
            case Integer i -> "It's an Integer: " + (i * 2);
            case String s when s.startsWith("Hello") -> "Greeting found: " + s;
            case String s -> "A string: " + s;
            case null -> "Null value";
            default -> "Unknown type";
        };

        System.out.println(result);*/ // Output: Greeting found: Hello, Java 21
    }
}
