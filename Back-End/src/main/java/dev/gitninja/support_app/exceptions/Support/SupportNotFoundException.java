package dev.gitninja.support_app.exceptions.Support;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Request Not Found")
public class SupportNotFoundException extends SupportException {

    public SupportNotFoundException(String message) {
        super(message);
    }
    public SupportNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
