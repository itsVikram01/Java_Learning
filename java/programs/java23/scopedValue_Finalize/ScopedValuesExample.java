package java23.scopedValue_Finalize;

/*public class ScopedValuesExample {
    private static final ScopedValue<String> CURRENT_USER = ScopedValue.newInstance();

    public static void main(String[] args) {
        ScopedValue.where(CURRENT_USER, "Alice").run(() -> {
            System.out.println("Current User: " + CURRENT_USER.get());
        });
    }
}*/

// Scoped Values are a lightweight alternative to thread-local variables for immutable data sharing in threads.