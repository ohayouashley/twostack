public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World"); //print in Python
    }
}
//! TO compile
// Open terminal and use javac in therminal > name of the file you're wanting to compile and then hit enter
// in this case it would be java Test.java. if no errors - compile d successfully> creates new file 
//now you can evoke the interpreter command java and the name of the class file or bytecode file
// java Test
//every time you make changes to your code you will always need to re-compile and run

//*NOTES
//must be named after file name
//must be pascal cased meaning it needs to start with an uppercase letter and each word with another capital letter. ie BankAccount
//jdp class must need a main method
//public static void does the same thing as the function keyboard.
//main is name of the method and String is to declare the parameter - must include data type.
//won't run code unless syntax errors are corrected


//! Compiling and running your code  
//1. compile it with command javac NameOfFile.java
//2. fix any syntax erros that come up during the compiling and re-compile until there are no erros
//3. run your program with the command javaNameOfFile

//? how do you define the entry point of a Java Program?
//*with a public main(String[] args) method