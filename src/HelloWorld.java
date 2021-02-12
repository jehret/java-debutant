public class HelloWorld {
    public static void main(String... args) {
        int age = 43;
        System.out.printf("Mon age est %d ans.", age);
        if (age > 30) {
            System.out.println(" Oui, je fais plus jeune.");
        }

        int ageDuCapitaine=20;
        if (ageDuCapitaine > 20 && age < 50)
        {
            System.out.println("L'age du capitaine est "+ageDuCapitaine);
            System.out.println("Hello");
            System.out.println("World!");
        }


    }
}
