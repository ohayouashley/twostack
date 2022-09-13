import java.util.Random;
import java.util.ArrayList;
//!In order to use the Random method you must  import it from the java util


public class Puzzle {
//*Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
//todo 1. First you need to create an array.
//todo 2.Syntax will be: ArrayList<Integer> randomNum = new ArrayList<Integer();
public ArrayList<Integer> getTenRolls() { 
    ArrayList<Integer> randomTen = new ArrayList<Integer>(); //todo 1. and 2.
    Random rand = new Random(); //todo 3.

    for(int i = 1; i <= 10; i++) {
        randomTen.add(rand.nextInt(20) + 1);
    }
    
    return randomTen; 
}
//todo 3. Next you'll use a dependency injection (create an instance of the Random class so that you can use it. This will contain all the methods from the Rand library.
//todo 4. now you'll create a loop using the nextInt function. It sets a random seed and then sends you the next random int that it comes up with. You set the bounds and it's exclusive. In order to get in inclusive we have to edit the bounds a little bit so that it hits 20. We had to add one to it to shift the range over one. 
//*for(int i=1;#the start of iteration is one (of 20); i <= 20 # the random numbers are going to be less than or equal to 20; i++ # iterating over and over again.) */
//*randomTen# is the new array .add is adding what you want in your array. (rand#is the instance of the Random class .nextInt is the method used to choose a random number between in this case 1 and 20 (20) + 1 #20 is the last number you want to iterate through but nextInt only chooses between 1 and 20 which doesn't include 20 so we need to add the + 1 to include 20 in that) */
//*################################## */

//!These are two possible solutions 

//?Here is the first way
    public String getRandomLetterArray() {
        Random rand = new Random();

        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];
        for(int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetString.charAt(i));
        }
//!charAt can get some thing out of the method. 
        return alphabet[rand.nextInt(26)];
    }

// getRandomLetter

// Write a method that will:

// Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
// Generate a random index between 0-25, and use it to pull a random letter out of the array.
// Return the random letter.
//?Here is the second way. 
    public String getRandomLetter() {
        Random rand = new Random();
        String alphabetString = "abcdefghijklmnopqrstuvwxyz"; 
        char randomChar = alphabetString.charAt(rand.nextInt(26));

        return String.valueOf(randomChar);
    }

//! generate password
//! write a method that uses the previous method to create a random
//! string of 8 characters, and return that string.

    public String generatePassword() {
        String password = "";
        for(int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }

//!getNewPasswordSet
//!write a method that takes an int length as an argument
//!and creates an array of random eight character words.
//!the array should be the length passed in as an int.

// public ArrayList<String> getNewPasswordSet(int length) {

//     ArrayList<String> passwordSet = new ArrayList<String>(); 
//     for(int i=0; i < length; i++) {
//         passwordSet.add(generatePassword());
//     }
//     return passwordSet;
// }
}



//?implement different algorithms in java
//?practice Array and ArrayList
//?practice loopos
//?learn and use the random class
//?call methods from within other methods in the same class.


