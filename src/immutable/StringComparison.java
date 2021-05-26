package immutable;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "xyz";
        String s3 = "abc";


        // If s1 and s3 refer to same
        // memory location return true
        // else false. == compares
        // memory location
        System.out.println(s1 == s3);


        // equals() method compares
        // the content.
        System.out.println(s1.equals(s3));

        String s4 = new String("abc");

        System.out.println(s1 == s4);
        // false

        // equals() does not care about
        // memory location
        System.out.println(s1.equals(s4));

        // false, because if we create a string
        // with new variable. JVM allocates
        // a new memory

        String s5 = "abc";

        System.out.println(s1 == s5);
        // true, JVM did not create
        // a create new memory. It referred
        // s5 to where s1 was referring
        // to. Coz both have value "abc".

        // If we want a string to go to string pool and
        // be reused anywhere we don't use new method
        // and directly assign value.


    }
}
