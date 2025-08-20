package handling;

public class AuthenticationException extends RuntimeException{
    public AuthenticationException(){
        super("Password Mismatch");
    }
}
