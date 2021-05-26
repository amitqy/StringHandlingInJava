package immutable;


public class StringComparisonVsObjectComparison {
    public static void main(String[] args) {
       User user1 = new User(1,"abc");
       User user2 = new User(2,"abc");

        System.out.println(user1 == user2);
        // false, mem location different

        System.out.println(user1.equals(user2));
        // false, contents not same

        // making content of user2 same as user1
        user2 = new User(1,"abc");

        System.out.println(user1.equals(user2));
        // false. equals behave differently with objects

    }
}
