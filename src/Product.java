public class Product {
    int id;
    String name;

    Product(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Product iphone = new Product(1, "iphone");
        // address reference is printed
        System.out.println(iphone);
        // Product@27f674d
        String s = "123";
        Integer i = new Integer(456);

        // string are treated differently while printing
        // address is not print when we print String object, same for Integer
        System.out.println(s);
        // 123
        System.out.println(i);
        // 456
    }

}
