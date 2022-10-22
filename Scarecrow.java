/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

class Scarecrow {

    /* Parts of the Scarecrow
     * TODO: Uncomment remaining parts as you implement each class
     */
    private Pumpkin head;
     private Shirt body;
     private Pants legs;
    // private Hat hat;
     private Boot leftFoot;
     private Boot rightFoot;
     private Banner sign;
    private String message;

    /* Constructor
     * TODO: initialize remaining parts
     */


    public Scarecrow(Pumpkin h, Shirt shirt, Pants pants, Boot lfoot, Boot rfoot, Banner banner, String string) {
        head = h;
        body = shirt;
        legs = pants;
        leftFoot = lfoot;
        rightFoot = rfoot;
        sign = banner;
        message = string;
        

    }

    /* Displays the Scarecrow 
     * TODO: call the .display() method of each part... 
     *       ...in the right order!
    */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /* Main method (for testing) */
    public static void main(String[] args) {

        // TODO: Don't forget to update the line below if you modify the constructor
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Boot("Left"), new Boot("Right"), new Banner(""), new String());

        // If a message was passed in on the command line, extract and store it
        // TODO: in Step 4, you'll pass this value along to your Banner constructor
        if (args.length > 0) {
            myScarecrow.message = args[0];
            myScarecrow.sign = new Banner(myScarecrow.message);
        } else {
            myScarecrow.message = "Happy Halloween";
        }

        myScarecrow.display();
    }

}
