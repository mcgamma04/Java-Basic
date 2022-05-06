package jdbc.exceptions;

public class RecordNotFoundExcecption extends RuntimeException{
    public RecordNotFoundExcecption(String message) {
        super(message);
    }
}
