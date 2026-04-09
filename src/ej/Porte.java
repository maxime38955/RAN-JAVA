package ej;

public class Porte extends Bloc {
	
	private boolean verouillee;

	protected Porte(int longueur, int largeur, int hauteur,  final boolean verouillee) {
		super(longueur, largeur, hauteur);
		this.verouillee = verouillee;
		 this.couleur = Couleur.BLEU;
		
	}
    
	
	 public boolean estVerrouilee() {
	    	
		  
	    	
	    	return verouillee;
	    
	    }
	  
	 

	 public void verouiller() throws PorteVerrouilleException {
		 
		 if(this.verouillee == false){
		 this.verouillee = true;
		 }
		 else {
			 throw new PorteVerrouilleException();
		 }
	 }

}
