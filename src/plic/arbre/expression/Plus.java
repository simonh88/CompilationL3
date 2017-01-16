package plic.arbre.expression;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class Plus extends BinaireArithmetique {

    public Plus(Expression gauche, Expression droite) {
        super(gauche, droite);
    }
    
    @Override
    public String operateur() {
        return " + " ;
    }

    @Override
    public void verifier() {

    }

    @Override
    public String toMIPS() {
        StringBuilder strb = new StringBuilder();
        strb.append(gauche.toMIPS());
        strb.append("move $t8, $v0\n");
        strb.append(droite.toMIPS());
        strb.append("add $v0, $t8, $v0\n");
        return strb.toString();
    }
}
