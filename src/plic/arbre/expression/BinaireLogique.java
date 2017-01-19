package plic.arbre.expression;

import plic.exceptions.AnalyseSemantiqueException;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public abstract class BinaireLogique extends Binaire {

    protected BinaireLogique(Expression gauche, Expression droite) {
        super(gauche, droite);
    }

    public void verifier(){
    	String gaucheType = gauche.type();
    	String droiteType = droite.type();
    	if(!droiteType.equals("booleen") || !gaucheType.equals("booleen")){
    		throw new AnalyseSemantiqueException("L'une des deux operandes logiques n'est pas un booleen");
    	}
    }
    
    public String type(){
    	return "booleen";
    }

}
