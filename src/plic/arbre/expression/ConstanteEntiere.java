package plic.arbre.expression;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class ConstanteEntiere extends Constante {
    
    public ConstanteEntiere(String texte, int n) {
        super(texte, n) ;
    }
    
    public String type(){
    	return "entier";
    }
    
    @Override
    public String toMIPS() {
        String s = "li $v0, "+ this.cste+ "\n";
        return s;
    }

    public String getCste(){
    	return this.cste;
    }
    
	@Override
	public void verifier() {
		// TODO Auto-generated method stub
		
	}
}
