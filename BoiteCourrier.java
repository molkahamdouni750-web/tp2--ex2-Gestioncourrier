package tp2ex2gestioncourriers;

public class BoiteCourrier {

    private courrier[] courriers;
    private int nbCourriers;

    public BoiteCourrier(int n) {

        courriers = new courrier[n];
        nbCourriers = 0;
    }

    public void ajouter(courrier c) {

        if (nbCourriers < courriers.length) {

            courriers[nbCourriers] = c;
            nbCourriers++;

        } else {

            System.out.println("Boite pleine !");
        }
    }

    public double affranchir() {

        double total = 0;

        for (int i = 0; i < nbCourriers; i++) {

            total += courriers[i].affranchir();
        }

        return total;
    }

    public int courriersInvalides() {

        int compteur = 0;

        for (int i = 0; i < nbCourriers; i++) {

            if (!courriers[i].estValide()) {
                compteur++;
            }
        }

        return compteur;
    }

    public void afficher() {

        for (int i = 0; i < nbCourriers; i++) {

            System.out.println("------- Courrier " + (i + 1) + " -------");

            courriers[i].decrire();

            if (!courriers[i].estValide()) {
                System.out.println("Courrier invalide");
            } else {
                System.out.println("Tarif : " + courriers[i].affranchir());
            }
        }
    }
}
