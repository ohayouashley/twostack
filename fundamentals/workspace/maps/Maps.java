import java.util.HashMap;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>(); //!Left String represents key type and right String represents value type.
        userMap.put("n@gmail.com", "Nancy Mai");
        userMap.put("s@gmail.com", "Sam Kang");
        userMap.put("t@gmai.com", "Tom Dan");

        String name = userMap.get("n@gmail.com");
        System.out.println("My full name is: " + name);//!Prints out the index you selected

        
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);//!Prints out the key
            System.out.println(userMap.get(key));//!Prints out the value of the key.
        }
        
        
    }
}
