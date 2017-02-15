package plic.arbre.expression;

import plic.tds.Idf;

/**
 * Created by simon on 14/02/17.
 */
public class AccesVariable extends Expression {


    private Idf idf;

    public AccesVariable(Idf id, int no) {
        super(no);
        this.idf = id;
    }

    public String toString() {
        return this.idf.toString();
    }

    public void verifier() {
        this.idf.verifier();
    }

    public String toMIPS() {
        StringBuilder sb = new StringBuilder();
        int deplacement = this.idf.getDeplacement();

        sb.append("\nlw $v0, ");
        sb.append(deplacement);
        sb.append("($s7)\n\n");

        return sb.toString();
    }

    @Override
    public String type() {
        return idf.getSymbole().getType();
    }
}
