//!length method example
// public class Strings {
//     public static void main(String[] args) {
//         String plants = "Plants are awesome!";
//         int length = plants.length();
//         System.out.println( "string length is: " +  length);
//     }
// }

// public class Strings {
//     public static void main(String[] args) {
//         String deskItems = "I have so many things on my desk right now omg";
//         int length = deskItems.length();
//         System.out.println("string length is: " + length);
//     }
// }
//!concatenate
// public class Strings {
//     public static void main(String[] args) {
//         String string1 = "my name is ";
//         String string2 = "Ashley";
//         String string3 = string1.concat(string2);
//         System.out.println(string3);
//     }
// }

//!format
// public class Strings {
//     public static void main(String[] args) {
//         String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
//         System.out.println(ninja);
//     }
// }
//* Will print out Hi Jack, you owe me $25.00 !
//* Where %s is expecting a string
//* And %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point.

//!indexOf
// public class Strings {
//     public static void main(String[] args) {
//         String ninja = "welcome to cd!";
//         int a = ninja.indexOf("cd");
//         int b = ninja.indexOf("falafle");
//         int c = ninja.indexOf("welcome");
//     }
// }

//!Trim
// public class Strings {
//     public static void main(String[] args) {
//         String sentence = "   spaces everywhere!    ";
//         System.out.println(sentence.trim());
//     }
// }
//!Strictly equals ==
// public class Strings {
//     public static void main(String[] args) {
//         String a = new String(" Dojo ");
//         System.out.println( a == "Dojo" );
//     }
// }

//! .equals() method
public class Strings {
    public static void main(String[] args) {
        String a = new String(" Dojo ");
        System.out.println( a.equals(" Dojo "));
    }
}
//? WHY IS MINE PRINTING FALSE?