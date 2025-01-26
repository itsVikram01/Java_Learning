package java.exception.exceptionHandlingInSpringboot.localExceptionHandling;

//@RestController
public class LocalExceptionHandlingInController {

    /*@GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid ID");
        }
        return new User(id, "John Doe");
    }*/

    //@ExceptionHandler(IllegalArgumentException.class)
    /*public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }*/
}
