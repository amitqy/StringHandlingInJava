package immutable;

public class Test {
    public static void main(String[] args) {

        // String s1 = "abc";
        // suppose s1 refers to memory location 100
        // s1 = "bac"
        // Now "abc" is not changed in its location,
        // rather a new memory is created and s1 points
        // to that. That's why we say strings are immutable.
        // We have to reassign the string to new reference



        User user = new User(1,"Amit");
        System.out.println(user);

        String s3 = "Hello";
        String s4 = "World";

        System.out.println("Before concat " + s3 + "--" + s4);
        // Before concat Hello--World

        s3.concat(s4);

        System.out.println("After concat " + s3 + "--" + s4);
        // After concat Hello--World

        // Notice how content of s3 did not change even after
        // it is concatenated with s4. It happened because
        // strings are immutable.
        // A string "HelloWorld" got created in memory but
        // on one referred to it. That data where s3 referred
        // did not get changed.
        // We can only change where s3 can refer to, not the
        // data at which s3 refers.
        // So we do this

        s3 =  s3.concat(s4);

        System.out.println(s3);
        // HelloWorld
        // now it got changed, because we only changed where s3
        // refers












    }
}
