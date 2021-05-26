public class StringDemo {
    public static void main(String[] args) {

        // Different ways of creating a string

        // string literal
        String s = "abc";

        String s1 = new String("seven");

        char c[] = {'a','e','i','o','u'};

        // constructor takes char array and returns a
        // string
        String s2 = new String(c);

        byte b[] = {65,66,67};

        // constructor takes byte array
        // converts byte values from asci to Character
        String s3 = new String(b);

        System.out.println(s);
        // abc
        System.out.println(s1);
        // seven
        System.out.println(s2);
        // aeiou
        System.out.println(s3);
        // ABC



    }
}
