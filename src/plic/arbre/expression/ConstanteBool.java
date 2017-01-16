package plic.arbre.expression;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class ConstanteBool extends Constante {
    
    public ConstanteBool(String texte, int n) {
        super(texte, n) ;
    }

    @Override
    public void verifier() {

    }

    @Override
    public String toMIPS() {
        String s;
        if(cste.equals("faux")) s = "li $v0, 0\n";
        else s = "li $v0, 0\n";
        return s;
    }
}
