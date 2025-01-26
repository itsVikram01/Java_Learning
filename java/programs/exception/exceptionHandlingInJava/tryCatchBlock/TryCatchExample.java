package java.exception.exceptionHandlingInJava.tryCatchBlock;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
