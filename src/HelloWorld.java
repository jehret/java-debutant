public class HelloWorld {
    public static void main(String... args) {
        int age = 23;
        System.out.printf("Mon age est %d ans.", age);
        if (age >= 30) {
            System.out.println(" Oui, je fais plus jeune.");
        }
        else if (age < 10){
            System.out.println(" Bravo à toi de commencer si jeune !");
        }
        else if (age == 25){
            System.out.println(" 25 ans vous devez être en pleine forme !");
        }
        else {
            System.out.println(" Et je suis fier de mon âge.");
        }

    }
}
