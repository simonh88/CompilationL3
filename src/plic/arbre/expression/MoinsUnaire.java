package plic.arbre.expression;

import plic.exceptions.AnalyseSemantiqueException;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class MoinsUnaire extends Unaire {
    
    public MoinsUnaire(Expression expr) {
        super(expr);
    }

    @Override
    public String operateur() {
        return "- " ;
    }

    @Override
    public void verifier() {
    	String type = expression.type();
    	if(!type.equals("entier")){
    		throw new AnalyseSemantiqueException("L'expression n'est pas une expression entiere");
    	}
    }

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "entier";
	}

}
