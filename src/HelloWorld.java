public class HelloWorld {
    public static void main(String... args) {
        int age = 50;
        System.out.printf("Mon age est %d ans.", age);
        if (age >= 30) {
            System.out.println(" Oui, je fais plus jeune.");
        }

        int ageDuCapitaine=25;
        if (ageDuCapitaine > 20 && age < 50) {
            System.out.println("L'age du capitaine est "+ageDuCapitaine);
        }
        else {
            System.out.println("Le code ne permet pas d'afficher l'âge du capitaine pour une raison farfelue.");
        }

    }
}
