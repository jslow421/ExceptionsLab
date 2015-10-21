package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong with
 * this program and use exception handling where appropriate to prevent the
 * program from crashing. In addition you must display a friendly error message
 * in a JOptionPane and ask the user to try again. (Yes, this violates the
 * Single Responsibility Principle, but for this lab, we'll overlook that.)
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {

    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        
        
        String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        
        String lastName = null;
        try{
            lastName = app.extractLastName(fullName);
        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        
/*poor attempt -- should be in the method and output here
        String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        
            JOptionPane.showMessageDialog(null, "Please enter a name");
            if(fullName == null){
                JOptionPane.showMessageDialog(null, "You must enter a name");
            }
            else {
            String lastName = app.extractLastName(fullName);
            if(fullName.equals(lastName)){
                JOptionPane.showMessageDialog(null,"Enter both a first and last name");
            }else{
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
            }
        } */
    }
    /**
     * Attempts to extract last name from full name constructed of two
     * parts -- first name and last name. This method cannot guarantee that the last
     * part is the last name. It must be assumed so. Be careful.
     * @param fullName a multi-part entry representing a full name
     * @return 
     * @throws IllegalArgumentException if full name is null, or full name is empty,
     * or full name has less than two parts. If full name has more than two parts
     * no exception will be thrown, because we cannot know if the last part is
     * definitely a last name, so we will assume that it is.
     */

    public String extractLastName(String fullName) throws IllegalArgumentException{
        if(fullName == null || fullName.isEmpty()){
            throw new IllegalArgumentException("Sorry, full name is required");
        }

        String[] nameParts = fullName.split(" ");
        if(nameParts.length < 2){
            throw new IllegalArgumentException("Sorry, you must provide both a "
                    + "first name and a last name");
        }
        return nameParts[nameParts.length - 1];
    }

}
