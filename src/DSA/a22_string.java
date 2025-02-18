package DSA;

public class a22_string {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 4, 19};
        String hulululu = "Piyush";
        /*
        String is the most commonly used class, everything which starts with a
        capital letter is a class.
        String pool in heap memory, which makes Strings more optimized
        Strings are immutable(cannot be changed)
         */
        String a = "Piyush";
        String b = "Piyush";
        /*
        Here both a and b will be pointing towards the same object "Piyush", it won't create
        2 separate objects named "Piyush" in the memory.
         */
//        System.out.println(a);
        a = "Shivnani";
//        System.out.println(a);
        /*
        Now you will think that I have changed the object even after saying that
        Strings are immutable. Here basically we have created a new object for "Shivnani"
        in the String pool and now a is pointing towards it instead of "Piyush" which
        will be handled by garbage collection.
        As "Piyush" is no longer referenced by any variable, it becomes eligible for
        garbage collection. Garbage collection is a process in Java where
        the Java Virtual Machine (JVM) automatically identifies and removes objects
        that are no longer reachable and are considered as garbage. The memory occupied
        by the "Piyush" string will be marked as eligible for reclamation, and the
        garbage collector will eventually free up that memory.
         */

        String first = "kunal";
        String second = "kunal";
//        System.out.println(first == second);
//        "==" checks if reference variables are pointing towards the same obejct


//        How to create different objects of same value then??
        String a1 = new String("Kunal");
        String a2 = new String("Kunal");
        /*
        This will make Java create 2 different objects for a1 and a2 inside the heap
        memory but outside the string pool. Now if we do "a1 == a2", it will give false
        as both are pointing towards different objects.
        When you only need to check values, use .equals() method.
         */
//        System.out.println(a1 == a2);
//        System.out.println(a1.equals(a2));
//        System.out.println(a1.charAt(0));
//        System.out.println(toString(new int[]{1,2,3,4}));

        Integer num = new Integer(56);
//        System.out.println(num.toString());

    }
}

