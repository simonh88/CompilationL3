package plic.declarations;

import plic.arbre.expression.Expression;
import plic.exceptions.AnalyseSemantiqueException;

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

        StringBuilder sb = new StringBuilder();

        sb.append(e.toMIPS());
        sb.append("\nmove $a0, $v0\n");
        sb.append("\nli $v0, 1\n");
        sb.append("\nsyscall\n\n");

        return sb.toString();
    }

    public void verifier() {
    	e.verifier();
    }

    public String toString() {
        return "";
    }
}
