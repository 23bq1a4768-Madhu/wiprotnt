package Overriding;

public class TestFruit {
	public static void main(String[] args) {

        Fruit f = new Fruit("Mango", "Sweet", "Large");
        f.eat();

        System.out.println();

        Apple a = new Apple();
        a.eat();

        System.out.println();

        Orange o = new Orange();
        o.eat();
    }
}
