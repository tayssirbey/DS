
public class Jcc { 
	private Film[] competition;
	private int annee;
	private static int NBFMAX=30;
	private static int nbF=0;
	
	public Jcc(int annee, int taille){
		this.competition= new Film[taille];
		this.annee=annee;
	}
	public void ajoutFilm(Film f) {
		if(nbF<competition.length) {
			competition[nbF]=f;
			nbF++;
		}else {
			System.out.println("la compétition est au complet");
		}
	}
	public void listeFilmsJCC() {
		for(int i=0;i<nbF;i++) {
			System.out.println(competition[i].toString());
		}
	}
	public float totalVenteBilletsJCC() {
        float total=0;
        for (int i=0;i<nbF;i++) {
            total+=competition[i].totalVenteBillets();
        }
        return total;
    }
	public static void main(String[] args) {
        Jcc jcc2021=new Jcc(2021,2);
        
        Documentaire film1=new Documentaire("Le dernier refuge", "Ousman", "Mali", 86, "La guerre civile");
        film1.setPlaces(30);
        
        Film film2 = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105);
        film2.setPlaces(45);
        
        jcc2021.ajoutFilm(film1);
        jcc2021.ajoutFilm(film2);
        
        System.out.println("Films en compétition JCC " + jcc2021.annee + ":");
        jcc2021.listeFilmsJCC();
        
        float totalVentes = jcc2021.totalVenteBilletsJCC();
        System.out.println("Montant total des ventes: " + totalVentes + " DT");
    }
	
	
}
