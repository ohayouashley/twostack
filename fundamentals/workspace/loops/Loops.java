import java.util.ArrayList;

public class Loops {
    
    public static void main(String[] args) {
        
        // ArrayList<String> dynamicArray = new ArrayList<String>();
        // dynamicArray.add("hello");
        // dynamicArray.add("world");
        // dynamicArray.add("etc");
        // for (int i = 0; i < dynamicArray.size(); i++);
        //     System.out.println(dynamicArray.get(i)); //!This one was wrong because I forgot the curly brackets after the loop syntax

        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("hello");
        dynamicArray.add("world");
        dynamicArray.add("etc");
        for (int i = 0; i < dynamicArray.size(); i++){
            System.out.println(dynamicArray.get(i));
        }

        ArrayList<String> anotherArray = new ArrayList<String>();
        anotherArray.add("My name");
        anotherArray.add("is going to be");
        anotherArray.add("Mermaid Ashley");
        anotherArray.add("from now on...");
        for(int i = 0; i < anotherArray.size(); i++) {
            System.out.println(anotherArray.get(i));
        }

        ArrayList<String> snacks = new ArrayList<String>();
        snacks.add("apples");
        snacks.add("sweet potato");
        snacks.add("trail mix");
        for(int i = 0; i < snacks.size(); i++) {
            if(snacks.get(i).charAt(0) == 'a') {
                snacks.remove(i);
            }
        System.out.println(snacks.get(i));
        }
    }


}


