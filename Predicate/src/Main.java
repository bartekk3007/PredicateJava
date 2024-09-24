import java.util.function.Predicate;

public class Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Bartek", "Kołakowski", 30);
        Person p2 = new Person("Andrzej", "Kowalski", 50);
        Person p3 = new Person("Bartek", "Kołakowski", 30);
        p1.test(Predicate.<Person>isEqual(p2).or(Predicate.isEqual(p3)));
        System.out.println(p1.equals(p3));
    }
}