public class TypeCasting {
    public static void main(String[] args) {
        int e = 120;
        byte b = (byte) e;

        // System.out.println(b);
            //! Testing Explicit casting

    double d = 32.33;
    double dd = 33.45;

    //casting the double d into an int

    int y = (int) d; 
    int yy = (int) dd;

    // System.out.println(yy);

    // long start = System.currentTimeMillis();
    // Integer sum = 0;
    // for (int z = 0; z < Integer.MAX_VALUE; z++) {
    //     sum += z;
    // }
    // System.out.println("Sum: " + sum);
    // long end = System.currentTimeMillis();
    // double total = (double) (end - start) / 1000;
    // System.out.println("Time of execution " + total + "seconds");
    // }

    long begin = System.currentTimeMillis();
    int sum = 0;
    for (int i = 0; i < Integer.MAX_VALUE; i++); {
        sum += i;
    }
    System.out.println("Sum: " + sum);
    long finish = System.currentTimeMillis();
    double total = (double) (finish - begin) / 1000;
    System.out.println("Time of execution: " + total + "seconds");

    }
}

//! when byte b = i we get an error: incompatible types: possible lossy conversion from int to byte. That means that int has more storage than
//! byte so there is not enough storage in the byte to hold the integer of 120. 
//! When we change it to byte b = (byte) i; we converted the 120 integer value into a 120 byte value. 
//? What if you tested it to more than it can be? If you changed int i = 130; you would receive -130.



