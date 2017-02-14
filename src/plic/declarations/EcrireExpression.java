package plic.declarations;

import plic.arbre.expression.Expression;

/**
 * Created by simon on 14/02/17.
 */
public class EcrireExpression extends Ecrire{

    private Expression e = null;

    public EcrireExpression(Expression e, int no) {
        super(no);
        this.e = e;
    }

    public String toMIPS() {
        return "";
    }

    public void verifier() {

    }

    public String toString() {
        return "";
    }
}
