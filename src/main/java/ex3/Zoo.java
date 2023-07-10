package ex3;

import java.util.List;

public class Zoo {

	private String nom;
	private List<String> animals;

	public Zoo(String nom) {
		this.nom = nom;
	}

	/**
	 * @param nomAnimal
	 * @param typeAnimal
	 * @param comportement
	 */
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
		animals.add(typeAnimal + " " + nomAnimal + " " + comportement);
	}

	public void afficherListeAnimaux() {
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
