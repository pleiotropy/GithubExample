public class FunWithCats
{
    public static void main(String[] args)
    {
        /* ------------------------------ */
        /* ------- FUN WITH CATS! ------- */
        /* ------------------------------ */


        // the variable "cat1" is an object of type Cat
        // (an instance of the Cat class)
        Cat cat1 = new Cat("orange", "Bubbles", 2, false);
        // cat1.printCatInfo();


        // let's make a new object of type Cat and call it "cat2"
        // cat2 has a new set of attributes from cat1
        Cat cat2 = new Cat("spotted brown", "Monster", 7, true);
        // cat2.printCatInfo();


       /* Exercise 1: uncomment lines 24 and 25 below, then run the code again.
          these two lines of code call the goToSleep and printCatInfo methods on cat1!
          look inside the Cat class to find these methods so you can see what happens!
          can you determine what has changed in cat 1?
       */
        // cat1.goToSleep();
        // cat1.printCatInfo();


        // Exercise 2. add code below to wake up both cat1 AND cat2 and print the updated info for each;
        // you will need to use the wakeUp method and the printCatInfo method
        // cat1.wakeUp();
        // cat2.wakeUp();
        // cat1.printCatInfo();
        // cat2.printCatInfo();


       /* Exercise 3. Write code below to create another Cat object
          Name the variable whatever you want (cat3, scruffy, x, etc.)
          Look at the constructor to see what info you need to pass, in what order!
          Give the Cat whatever attributes that you want, and practice
          putting them to sleep, waking them up
          them back up, etc.

*/
        Cat cat3 = new Cat("black, white, and brown", "Pleio", 10, true);
        Cat cat4 = new Cat("black", "Koopa", 12, false);
        /*
        cat1.printCatInfo();
        cat2.printCatInfo();
        cat3.printCatInfo();
        cat4.printCatInfo();
        cat3.wakeUp();
        cat4.goToSleep();
        cat3.printCatInfo();
        cat4.printCatInfo();
       */

       /* Exercise 4. Uncomment the line below and see what happens when you run the program. Why?
          FIX THE ERROR and run it again!  Be sure you get ALL parameters AND match the types!
       */
        Cat cat5 = new Cat("orange and black", "Garfield",44, false);




       /* Exercise 5. Free style!  Code up anything you want below to test things out!
       // Feel free to edit the Cat class itself if you want to change things up,
       // try adding a new method, figure out what certain words mean, etc.
       */
        cat1.wakeUp();
        cat2.wakeUp();
        cat3.wakeUp();
        cat4.wakeUp();
        cat5.wakeUp();
        cat1.printCatInfo();
        cat2.printCatInfo();
        cat3.printCatInfo();
        cat4.printCatInfo();
        cat5.printCatInfo();

    }
}
