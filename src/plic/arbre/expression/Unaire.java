package plic.arbre.expression;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public abstract class Unaire extends Expression {

    protected Expression expression;

    protected Unaire(Expression expr) {
        super(expr.getNoLigne());
        expression = expr;
    }


    @Override
    public String toMIPS() {
        StringBuilder strb = new StringBuilder();
        strb.append(expression.toMIPS());
        switch (operateur()) {
            case " non ":
                //
                strb.append("not $v0, $v0\n");
                strb.append("andi $v0, $v0, 0x1\n");
                break;
            case "- ":
                strb.append("neg $v0, $t8\n");
                break;
        }
        return strb.toString();
    }

    public abstract String operateur();

    @Override
    public String toString() {
        return "(" + operateur() + expression + ")";
    }

}
