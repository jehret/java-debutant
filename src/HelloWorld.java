public class HelloWorld {
    public static void main(String... args) {
        int age = 45;
        System.out.printf("Mon age est %d ans.", age);
        if (age >= 30) {
            System.out.println(" Oui, je fais plus jeune.");
        }

        int ageDuCapitaine=25;

        System.out.println(ageDuCapitaine > 20 && age < 50 ? "L'age du capitaine est "+ageDuCapitaine : "Le code ne permet pas d'afficher l'âge du capitaine pour une raison farfelue.");

    }
}
