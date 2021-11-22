package pro.sky.javadev.lesson8;

public class Homework08ObjectsAndClasses {
    public static void main(String[] args) {
        Author akunin = new Author("Boris", "Akunin");
        Author dumas = new Author("Aleksander", "Dumas");

        Book leviathan = new Book(akunin, "Leviathan", 2000);
        Book theThreeMusketeers = new Book(dumas, "TheThreeMusketeers", 2005);

        System.out.println(leviathan);
        System.out.println(theThreeMusketeers);

        System.out.println("Now we set a new publish year ...");
        theThreeMusketeers.setPublishYear(2021);
        System.out.println(theThreeMusketeers);

    }
}
