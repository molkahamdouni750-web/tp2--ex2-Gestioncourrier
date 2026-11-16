package tp2ex2gestioncourriers;


	public class courrier {

	    protected boolean modeExpedition;
	    protected String adresse;

	    public static final double TARIF_BASE = 0.5;

	    public courrier(boolean modeExpedition, String adresse) {
	        this.modeExpedition = modeExpedition;
	        this.adresse = adresse;
	    }

	    public boolean estValide() {
	        return adresse != null;
	    }

	    public void decrire() {
	        System.out.println("Adresse : " + adresse);

	        if (modeExpedition) {
	            System.out.println("Mode : Express");
	        } else {
	            System.out.println("Mode : Normal");
	        }
	    }

	    public double affranchir() {

	        if (!estValide()) {
	            return 0;
	        }

	        if (modeExpedition) {
	            return TARIF_BASE * 2;
	        }

	        return TARIF_BASE;
	    }
	}


