package ex2;

public class LivretA extends CompteBancaire {

	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0, tauxRemuneration);
	}

	
	/** 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		if (this.getSolde() - montant > 0) {
			this.setSolde(this.getSolde() - montant);
		}
	}

	public void appliquerRemuAnnuelle() {
			this.setSolde(this.getSolde() + this.getSolde() * this.getTauxRemuneration() / 100);
	}

}
