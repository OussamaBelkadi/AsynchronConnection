package inventiv.it.test.exceptions;

public class NotExist extends RuntimeException{
    public NotExist(String message){
        super(message);
    }
}
