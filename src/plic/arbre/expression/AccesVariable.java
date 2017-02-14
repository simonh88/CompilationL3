package plic.arbre.expression;

import plic.tds.Idf;

/**
 * Created by simon on 14/02/17.
 */
public class AccesVariable extends Expression{


    private Idf idf;

    public AccesVariable(Idf id, int no) {
        super(no);
        this.idf = id;
    }

    public String toString() {
        return "" + this.idf;
    }

    public void verifier() {
        idf.verifier();
    }

    public String toMIPS() {
        StringBuilder sb = new StringBuilder();
        int dep = idf.getDeplacement();
        sb.append(String.format("\tlw $v0, %d($s7)\n", dep));
        return sb.toString();
    }

    @Override
    protected String type() {
        return idf.getSymbole().getType();
    }
}
