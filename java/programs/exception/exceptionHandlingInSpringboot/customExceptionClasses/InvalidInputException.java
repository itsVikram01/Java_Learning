package programs.exception.exceptionHandlingInSpringboot.customExceptionClasses;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }
}
