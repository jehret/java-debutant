public class HelloWorld {
    public static void main(String... args) {
        String mois="Mai";

        switch (mois) {
            case "Janvier" :
            case "Février" :
            case "Mars" :
                System.out.println("C'est l'hiver");
                break;
            case "Avril" :
            case "Mai" :
            case "Juin" :
                System.out.println("C'est le printemps");
                break;
            case "Juillet" :
            case "Août" :
            case "Septembre" :
                System.out.println("C'est l'été");
                break;
            case "Octobre" :
            case "Novembre" :
            case "Décembre" :
                System.out.println("C'est l'automne");
                break;

        }

    }
}
