public class PlantStoreTest {
    
    public static void main(String[] args) {

        PlantStore plantStore = new PlantStore();

        String testGreeting = plantStore.basicGreeting();

        String saleGreeting = plantStore.guestGreeting("morning", "philodendrons");

        String customerResponse = plantStore.guestGreetingResponse("Five pm");

        String dateTime = plantStore.timeDateAnnouncement();

        // System.out.println(dateTime);
//!Testing .length method
        String barbie = "I'm a barbie girl in a barbie world";
        int length = barbie.length();
        // System.out.println("String length is : " + length);
//!Testing .concat method
        String string1 = "My name is ";
        String string2 = "Ashley";
        String string3 = string1.concat(string2);
        // System.out.println(string3);

        String what = "My milkshakes brings all the ";
        String who = "boys to the yard and they're like,mine's better than yours ";
        String allTogether = what.concat(who);
        // System.out.println(allTogether);
//!Testing .format method
        String formatTest = String.format("Hi %s, I want $%.2f new plants!", "Manda", 24.0);
        // System.out.println(formatTest);

//!Testing .indexOf method

        // String karma = "Karma is a bitch!";
        // int one = karma.indexOf("Karma");
        // int two = karma.indexOf("a");
        // System.out.println(a);

        String ninja = "Welcome to Coding Dojo!";
        int a = ninja.indexOf("Coding"); // a is 11
        int b = ninja.indexOf("co"); // b is 3
        int c = ninja.indexOf("pizza"); // c is -1, "pizza" is not found
        // System.out.println(a);

//*back to plant store */
        String customerTest = plantStore.storeClerkChat("I'm a Customer here and no one is talking to me.");
        String storeClerkTest = plantStore.storeClerkChat("I'm the Store Clerk if you have any questions.");

        System.out.println(customerTest);
    }
}

