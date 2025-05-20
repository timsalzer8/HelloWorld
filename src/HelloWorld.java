public class HelloWorld {
    public static void main(String[] args) {
        String name = "Tim";
        String job = "Kindergarten Teacher";
        String age = "31";
        String hometown = "Marbach";
        showGreeting(10);
        showGreeting(15);
        showGreeting(20);

        System.out.println("My name is " + name + ". My job is " + job + ". " + "I'm " + age + " years old and I live in " + hometown + ".");
    }

    public static void showGreeting(Integer hour) {

        if (hour < 12) {
            System.out.println("Good morning!");
        } else if (hour < 17) {
            System.out.println("Good midday!");
        } else if (hour > 17) {
            System.out.println("Good evening!");
        }
    }

}