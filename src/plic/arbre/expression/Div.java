package plic.arbre.expression;

import plic.exceptions.AnalyseSemantiqueException;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class Div extends BinaireArithmetique {

    public Div(Expression gauche, Expression droite) {
        super(gauche, droite);
    }

    @Override
    public String operateur() {
        return " / ";
    }

    public void verifier(){
    	super.verifier();
    	if(((ConstanteEntiere)droite).getCste().equals("0")){
    		throw new AnalyseSemantiqueException("Division par 0 interdite");
    	}
    }

}
