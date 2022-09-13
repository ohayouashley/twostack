import java.util.ArrayList;
import java.util.Random;

public class TestPuzzle {
    
        public static void main(String[] args) { //! This is the only file that you need this line in because it is your testing file
            Puzzle generator = new Puzzle();
            ArrayList<Integer> randomRolls = generator.getTenRolls();
            System.out.println(randomRolls);

            System.out.println(generator.getRandomLetter());
            System.out.println(generator.generatePassword());
            // System.out.println(generator.getNewPasswordSet());




        }
}

//! You are using this file to:
//!1. starting the application using the public static void main
//!2. running methods that you have created in your "fast file" or in this case it would be Puzzle.java file 
//! Needed to create a whole instance of a class (Puzzle generator = new Puzzle) in order to use it's methods.

//!.generator is where we are calling that class.



