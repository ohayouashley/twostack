import java.util.Date;
public class AlfredBot {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        
        return String.format("Good %s, %s. Pleasure to see you this fine day.", dayPeriod, name);
    }
    
    public String dateAnnouncement() {

        return String.format("Today is %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1) {
            return "Alexis sucks. She's just a knock off of Alexa who I heard ruins Christmas";
        }

        if(conversation.indexOf("Alfred") > -1) {
            return "I'm at your service!";
        }
        
        return "Understood sir, very good sir";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

