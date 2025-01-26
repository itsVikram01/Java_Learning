package java.exception.exceptionHandlingInSpringboot.usingResponseStatus;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResponseStatusExample extends RuntimeException {
    public ResponseStatusExample(String message) {
        super(message);
    }
}
