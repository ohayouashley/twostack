public class FixedArrays {
    
    public static void main(String[] args) {

        int [] myArray;
        myArray = new int[5];//initialization 
        myArray[0] = 4;

        System.out.println(myArray);

        String[] fruits = {"apples", "banana", "papaya", "kiwi",};
        String temp = fruits[0];
        fruits[0] = fruits[fruits.length - 1]; 
        fruits[fruits.length - 1] = temp;

        for(int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
