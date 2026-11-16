package tp2ex2gestioncourriers;

public class lettre extends courrier {

    private double poids;
    private String format;

    public lettre(boolean modeExpedition, String adresse,
                  double poids, String format) {

        super(modeExpedition, adresse);

        this.poids = poids;
        this.format = format;
    }

    @Override
    public void decrire () {

        super.decrire();

        System.out.println("Poids : " + poids + " g");
        System.out.println("Format : " + format);
    }

    @Override
    public double affranchir() {

        if (!estValide()) {
            return 0;
        }

        double tarif;

        if (format.equals("A4")) {
            tarif = 2.50;
        } else {
            tarif = 3.50;
        }

        double montant = tarif + 0.5 * (poids / 1000);

        if (modeExpedition) {
            montant = montant * 2;
        }

        return montant;
    }
}
