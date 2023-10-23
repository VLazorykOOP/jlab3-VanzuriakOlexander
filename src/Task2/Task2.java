package Task2;

public class Task2 {
    public static void main(String[] args) {
        Money money1 = new Money(10, 50);
        Money money2 = new Money(5, 75);

        Complex complex1 = new Complex(3.5, 2.0);
        Complex complex2 = new Complex(1.5, 3.0);

        System.out.println("The sum " + money1.sum(money2).toString());
        System.out.println("The div " + money1.sub(money2).toString());
        System.out.println("The mult to 4: " + money1.mult(4));
        System.out.println("The div to 2: " + money1.div(2));

        System.out.println("The sum " + complex1.sum(complex2).toString());
        System.out.println("The div " + complex1.sub(complex2).toString());
        System.out.println("The mult to 4: " + complex1.mult(4));
        System.out.println("The div to 2: " + complex1.div(2));
    }
}
