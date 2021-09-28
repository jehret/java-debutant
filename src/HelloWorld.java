public class HelloWorld {
    public static void main(String... args) {

        Voiture voitureDeMichel=new Voiture();

        boolean jeContinue=true;
        int nb=0;
        while (jeContinue) {
            System.out.println("Hello World!");
            nb++;
            if (nb==5){
                continue;
            }
            System.out.println("Nb ne vaut pas 5");
            if (nb==10){
                jeContinue=false;
            }
        }

    }
}
