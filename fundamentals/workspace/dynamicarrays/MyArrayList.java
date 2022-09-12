import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>();
        System.out.println(myList);

        myList.add(10);
        myList.add(11);
        // System.out.println(myList); // this will return 10, 11 in your array. 

        //!If you want to take the 10 out of the array.
        //!Use .get to get the element 0 out of your ArrayList array. 
        Integer num = myList.get(0); //?Here you need to make sure to use parenthesis instead of brackets to  get the index.
        //?In order to get a specific index from an array you need to create a new  variable to use the .get method to select and print. 
        // System.out.println(num);//!Changed the parameter to num instead of (myList) because we changed the variable.

        //!If you want to set the index of 0 to 9 instead of 10. Use .set method.
        myList.set(0,9); //?Here you'll pass in two things. First is the index you want to change and the second is what you want to set it to.
        System.out.println(myList); //? Changed parameter back to myList instead of num because we are calling the entire array. 

        // ArrayList<Integer> myArray = new ArrayList<Integer>();
        
        // myArray.add(14);
        // myArray.add(36);

        // Integer newNum = myArray.get(0);
        // System.out.println(newNum);

        //!ArrayLists can hold a lot of different types. Example:
        ArrayList<Object> things = new ArrayList<Object>();
        things.add(10);
        things.add("hello");
        things.add(new ArrayList<Integer>());//!This creates a new array instide of the things array. 
        things.add(12.5);
        System.out.println(things);
        //Now I can add anything I want to that ArrayLIst. Here we are going to add another integer to our list as well as a string. 


    }
}
//array lists cannot hold primitive type. Need to include object version of thatt primitive type. 