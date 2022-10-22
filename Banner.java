/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * TODO: Modify this method to print a decorative banner, resized to fit the message
     */
    public void display() {

        int size = message.length(); //takes length of message

        for (int i=0; i< size + 12; i++) { //creates loop for decoration
            System.out.print("*");
        }

        System.out.println("\n" + "*** ~ " + message + " ~ ***"); //prints message with decoration

        for (int i=0; i< size + 12; i++) { //creates loop for decoration
            System.out.print("*");
        }

        System.out.println(" "); //decoration
        for (int i=0; i< size/.667; i++) {
            System.out.print(" ");
        }
        //System.out.println(" ");
        for (int i=0; i< size/2; i++) {
            System.out.print("*");
        }

    }  
    

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
    }
}
