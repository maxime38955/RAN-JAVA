package ej;

public class Main {
    
    public static void main(String[] args) {
	     

    	
    	   try {
    	       Porte p = new Porte(0, 1, 1, true);
    	        p.verouiller();
    	        System.out.println("La porte est vérouvillée");
    	        System.out.println(p.estVerrouilee());
    	    } catch (PorteVerrouilleException e) {
    	        System.out.println("La porte est déjà vérouvillée");
    	    }
    	
    }
    
}