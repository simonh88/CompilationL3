package plic.arbre.expression;

import plic.exceptions.AnalyseSemantiqueException;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public abstract class BinaireArithmetique extends Binaire {

    protected BinaireArithmetique(Expression gauche, Expression droite) {
        super(gauche, droite) ;
    }
    
    public void verifier(){
    	String gaucheType = gauche.type();
    	String droiteType = droite.type();
    	if(!droiteType.equals("entier") || !gaucheType.equals("entier")){
    		throw new AnalyseSemantiqueException("L'une des deux operandes arithmetiques n'est pas un entier");
    	}
    }
    
    public String type(){
    	return "entier";
    }

    
}
