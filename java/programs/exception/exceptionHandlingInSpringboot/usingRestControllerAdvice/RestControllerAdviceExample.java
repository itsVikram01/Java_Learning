package programs.exception.exceptionHandlingInSpringboot.usingRestControllerAdvice;

//@RestControllerAdvice
public class RestControllerAdviceExample {

    //@ExceptionHandler(ResourceNotFoundException.class)
    /*public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex) {
        ErrorResponse error = new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }*/

    //@ExceptionHandler(Exception.class)
    /*public ResponseEntity<ErrorResponse> handleGenericException(Exception ex) {
        ErrorResponse error = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Something went wrong", LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }*/
}
