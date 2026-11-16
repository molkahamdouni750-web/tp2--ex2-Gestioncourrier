package tp2ex2gestioncourriers;

public class TestPoste {

	public static void main(String[] args) {

        BoiteCourrier boite = new BoiteCourrier(5);

        lettre l1 = new lettre(false, "Hammamet", 200, "A4");

        lettre l2 = new lettre(true, "Nabeul", 500, "A3");

        Colis c1 = new Colis(false, "Tunis", 2000, 10);

        Colis c2 = new Colis(true, null, 3000, 15);

        boite.ajouter(l1);
        boite.ajouter(l2);
        boite.ajouter(c1);
        boite.ajouter(c2);

        boite.afficher();

        System.out.println("--------------------");

        System.out.println("Total affranchissement : "
                + boite.affranchir());

        System.out.println("Nombre de courriers invalides : "
                + boite.courriersInvalides());
    }
		// TODO Auto-generated method stub

	}


