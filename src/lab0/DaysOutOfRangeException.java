/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author jslowik
 */
public class DaysOutOfRangeException extends Exception{
    private static final String MESSAGE = "Incorrect vacation day amount";

    public DaysOutOfRangeException() {
        super(MESSAGE);
    }

    public DaysOutOfRangeException(String message) {
        super(MESSAGE);
    }

    public DaysOutOfRangeException(String message, Throwable cause) {
        super(MESSAGE, cause);
    }

    public DaysOutOfRangeException(Throwable cause) {
        super(MESSAGE, cause);//adding message so it is consistent
    }
    
    
}
