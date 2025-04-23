//Custom Exception
package bw.sportsleague;


public class InvalidPlayerException extends Exception {
    
    public InvalidPlayerException(String message) {
        super(message);
    }
}