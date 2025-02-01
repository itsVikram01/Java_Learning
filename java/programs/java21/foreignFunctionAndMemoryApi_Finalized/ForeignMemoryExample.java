package programs.java21.foreignFunctionAndMemoryApi_Finalized;
/*
import java.lang.foreign.*;
import java.lang.invoke.*;

public class ForeignMemoryExample {
    public static void main(String[] args) {
        try (MemorySegment segment = MemorySegment.allocateNative(100)) {
            MemoryAccess.setIntAtOffset(segment, 0, 42);
            int value = MemoryAccess.getIntAtOffset(segment, 0);
            System.out.println("Value: " + value); // Output: Value: 42
        }
    }
}
*/

// Provides safer and more performant ways to interact with native code and memory.