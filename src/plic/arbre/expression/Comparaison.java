package plic.arbre.expression;

import plic.exceptions.AnalyseSemantiqueException;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public abstract class Comparaison extends Binaire {
     
    protected Comparaison(Expression gauche, Expression droite) {
        super(gauche, droite);
    }

    public void verifier(){
    	String gaucheType = gauche.type();
    	String droiteType = droite.type();
    	if(!droiteType.equals("entier") || !gaucheType.equals("entier")){
    		throw new AnalyseSemantiqueException(" Line : "+this.getNoLigne() +"\n\t\t\t\t\tL'une des deux operandes de comparaison n'est pas un entier");
    	}
    }
    
    public String type(){
    	return "booleen";
    }

}
