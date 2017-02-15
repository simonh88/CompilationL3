package plic.arbre.expression;

import plic.exceptions.AnalyseSemantiqueException;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class NonLogique extends Unaire {
    
    public NonLogique(Expression expr) {
        super(expr);
    }

    @Override
    public String operateur() {
        return " non " ;
    }

    @Override
    public void verifier() {
    	String type = expression.type();
    	if(!type.equals("booleen")){
    		throw new AnalyseSemantiqueException("L'expression n'est pas une expression booleenne");
    	}
    }

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "booleen";
	}
}
