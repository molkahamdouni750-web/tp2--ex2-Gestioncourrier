package tp2ex2gestioncourriers;

public class Colis extends courrier {

    private double poids;
    private double volume;

    public Colis(boolean modeExpedition, String adresse,
                 double poids, double volume) {

        super(modeExpedition, adresse);

        this.poids = poids;
        this.volume = volume;
    }

    @Override
    public void decrire() {

        super.decrire();

        System.out.println("Poids : " + poids + " g");
        System.out.println("Volume : " + volume + " litres");
    }

    @Override
    public double affranchir() {

        if (!estValide()) {
            return 0;
        }

        double montant = 0.25 * volume + (poids / 1000) * 1.0;

        if (modeExpedition) {
            montant = montant * 2;
        }

        return montant;
    }
}
