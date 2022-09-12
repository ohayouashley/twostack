import java.util.Date;
public class PlantStore {
    
    public String basicGreeting() {
        return "Welcome to the plant store! How are you doing today?";
    }

    // public String guestGreeting(String name, String dayPeriod) {
        
    //     return String.format("Good %s, %s. Pleasure to see you this fine day.", dayPeriod, name);
    // }

    public String guestGreeting(String dayPeriod, String plantType) {

        return String.format("Good %s, How are you doing? We have a sale today $5 off %s.", dayPeriod, plantType);
    }

    public String guestGreetingResponse(String appointmentTime) {

        return String.format("That's awesome! Thank you. Do you know what the date and time is I have an appointment at %s", appointmentTime);
    }

    public String timeDateAnnouncement() {
        return String.format("Yeah, today is %s", new Date());
    
    }

    public String storeClerkChat(String conversation) {
        if(conversation.indexOf("Customer") > -1) {
            return "So how is your day going so far?";
        }

        if(conversation.indexOf("Store Clerk") > -1) {
            return "How's business going?";
        }

        return "...crickets";
        }
}
    

