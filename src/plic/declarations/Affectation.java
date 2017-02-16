package plic.declarations;

import plic.arbre.expression.Expression;
import plic.exceptions.AnalyseSemantiqueException;
import plic.tds.Idf;

/**
 * Created by simon on 14/02/17.
 */
public class Affectation extends Instruction {
    private Expression e;
    private Idf idf;

    public Affectation(Idf idf, Expression e, int no) {
        super(no);
        this.idf = idf;
        this.e = e;
    }

    public String toMIPS() {
        StringBuilder sb = new StringBuilder();

        sb.append(e.toMIPS());
        sb.append("\n sw $v0, ");
        sb.append(idf.getDeplacement());
        sb.append("($s7)\n\n");

        return sb.toString();
    }

    public void verifier() {
    	e.verifier();
    	if(!idf.getSymbole().getType().equals(e.type())){
    		throw new AnalyseSemantiqueException("Impossible d'affecter une expression "+e.type()+" dans une variable de type "+idf.getSymbole().getType());
    	}
    	
    }

    public String toString() {
        return "affectation";
    }
}
