package foundation;

public class Greetings {
    public static void main(Integer[] args) {
        System.out.println("Welcome to Console Application building");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Java FSD learning journey");
        Greetings.main("null");
        Greetings.main(new Integer[]{12,34});
    }
    public static void main(String args) {
        System.out.println("Welcome to Web app building");
    }
}
