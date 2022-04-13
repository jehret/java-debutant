public class HelloWorld {
    public static void main(String... args) {

        Voiture voitureDeMichel=new Voiture();
        voitureDeMichel.nbPortes=3;
        voitureDeMichel.automatique=true;
        voitureDeMichel.couleur="Vert";

        System.out.println("La voiture est "+voitureDeMichel.couleur+" et elle dispose de "+voitureDeMichel.nbPortes+" portes.");

        Voiture voitureDeJerome=new Voiture();
        voitureDeJerome.couleur="Rouge";
        voitureDeJerome.couleur=null;

        if (voitureDeJerome.couleur==null){
            System.out.println("Couleur null");
        }

    }
}
