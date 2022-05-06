package jdbc.exceptions;

public class WrongOption extends  RuntimeException{
    public WrongOption(String message) {
        super(message);
    }
}
