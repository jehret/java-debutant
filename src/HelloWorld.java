public class HelloWorld {
    public static void main(String... args) {

        Voiture voitureDeMichel=new Voiture();
        voitureDeMichel.nbPortes=3;
        voitureDeMichel.automatique=true;
        voitureDeMichel.couleur="Vert";

        System.out.println("La voiture est "+voitureDeMichel.couleur+" et elle dispose de "+voitureDeMichel.nbPortes+" portes.");

    }
}
