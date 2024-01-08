package dev.gitninja.support_app.exceptions.Support;

public class SupportException extends RuntimeException{
    
    public SupportException(String message){
        super(message);
    }

    public SupportException(String message, Throwable cause){
        super(message, cause);
    }
}
