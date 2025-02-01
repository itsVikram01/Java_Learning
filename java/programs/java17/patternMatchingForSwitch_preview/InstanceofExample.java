package programs.java17.patternMatchingForSwitch_preview;

// If you can't enable preview features, you can achieve similar functionality using instanceof checks in Java 17:
public class InstanceofExample {
    public static String test(Object obj) {
        if (obj instanceof Integer i) {
            return "Integer: " + i;
        } else if (obj instanceof String s) {
            return "String: " + s;
        } else if (obj == null) {
            return "Null value";
        } else {
            return "Unknown type";
        }
    }

    public static void main(String[] args) {
        System.out.println(test(42));        // Output: Integer: 42
        System.out.println(test("Hello"));  // Output: String: Hello
        System.out.println(test(null));     // Output: Null value
    }
}
