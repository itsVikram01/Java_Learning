package programs.java17.patternMatchingForSwitch_preview;

// Patterns in switch are not supported at language level '17'.
// Pattern Matching for switch was introduced as a preview feature in Java 17, meaning it is not enabled by default in the standard language level.
// To use it, you need to explicitly enable the preview features during compilation and runtime.
// javac --release 17 --enable-preview PatternMatchingExample.java
// java --enable-preview PatternMatchingExample

/*public class PatternMatchingExample {
    public static String test(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case null -> "Null value";
            default -> "Unknown type";
        };
    }

    public static void main(String[] args) {
        System.out.println(test(42));  // Output: Integer: 42
        System.out.println(test("Hello"));  // Output: String: Hello
        System.out.println(test(null));  // Output: Null value
    }
}*/


