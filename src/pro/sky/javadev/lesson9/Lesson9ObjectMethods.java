package pro.sky.javadev.lesson9;

public class Lesson9ObjectMethods {
    public static void main(String[] args) {
        System.out.println("Authors:");
        Author akunin = new Author("Boris", "Akunin");
        Author akunin2 = new Author("Boris", "Akunin");
        Author dumas = new Author("Aleksander", "Dumas");

        System.out.println("Author copies equal: " + akunin.equals(akunin2));
        System.out.println("Author copies equal by hashCode: " + (akunin.hashCode() == akunin2.hashCode()));
        System.out.println("Authors equal: " + akunin.equals(dumas));
        System.out.println("Author equal by hashCode: " + (akunin.hashCode() == dumas.hashCode()));

        System.out.println(akunin);
        System.out.println(dumas);

        System.out.println("==================================");

        System.out.println("Books: ");
        Book leviathan = new Book(akunin, "Leviathan", 2000);
        Book leviathan2 = new Book(akunin, "Leviathan", 2000);
        Book theThreeMusketeers = new Book(dumas, "TheThreeMusketeers", 2005);

        System.out.println("Book copies equal: " + leviathan.equals(leviathan2));
        System.out.println("Book copies equal by hashCode: " + (leviathan.hashCode() == leviathan2.hashCode()));
        System.out.println("Book equal: " + leviathan.equals(theThreeMusketeers));
        System.out.println("Book equal by hashCode: " + (leviathan.hashCode() == theThreeMusketeers.hashCode()));
        System.out.println(leviathan);
        System.out.println(theThreeMusketeers);

    }
}

