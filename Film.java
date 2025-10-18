import java.util.Scanner;

public class Film {
	private String titre;
	private String realisateur;
	private String pays_dorigine;
	private int duree;
	private int nbPlaces;
	
	public int getPlaces() {
		return nbPlaces;
	}
	public void setPlaces(int nb) {
		this.nbPlaces=nb;
	}
	public String toString() {
		return titre + " de " + realisateur + " (" +pays_dorigine+ ") - "+ duree +" min. ";
	}
	public Film(String titre,String r,String pays,int d) {
		this.titre=titre;
		this.realisateur=r;
		this.pays_dorigine=pays;
		this.duree=d;
	}
	public float totalVenteBillets() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Nombre de places pour étudiants: ");
		int nbEtudiants= scanner.nextInt();
		if(nbEtudiants>this.nbPlaces) {
			System.out.println("Retapez le nombre de places pour étudiants: ");
			nbEtudiants= scanner.nextInt();
		}
		int nbPublic=nbPlaces-nbEtudiants;
		return ((nbEtudiants*2)+(nbPublic*3));
	}
	
}
