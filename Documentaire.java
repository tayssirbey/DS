public class Documentaire extends Film{
	private String sujet;
	private static float tarif=2;
	
	public Documentaire(String titre, String r, String pays, int d, String s) {
		super(titre, r, pays, d);
	}
	public String toString() {
		return (super.toString()+ " -Sujet: " + sujet);
	}
	public float totalVenteBillets() {
		return (getPlaces()*tarif);
	}
}
