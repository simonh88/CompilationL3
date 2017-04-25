package plic.declarations;

import plic.arbre.Classe;
import plic.arbre.expression.AccesVariable;
import plic.arbre.expression.Expression;
import plic.exceptions.AnalyseLexicaleException;
import plic.exceptions.AnalyseSemantiqueException;
import plic.tds.Idf;
import plic.tds.TDS;

/**
 * Created by antoine on 25/04/17.
 */
public class Instanciation extends Instruction {

    private Idf var;
    private Idf classe;

    public Instanciation(int no, Idf var, Idf classe) {
        super(no);
        this.var = var;
        this.classe = classe;
    }

    public String toMIPS() {
        StringBuilder sb = new StringBuilder();

        if(!TDS.getInstance().hasClasse(classe)) throw new AnalyseSemantiqueException(" Line " + this.getNoLigne()+"\n\t\t\t\t\tType d'objet inexistant");

        Classe c = TDS.getInstance().getClasse(classe.getNom());

        int id = TDS.getInstance().getId();

        System.out.println("#########   id de la classe : "+ TDS.getInstance().getClasseId(classe.getNom()));

        TDS.getInstance().setId(TDS.getInstance().getClasseId(classe.getNom()));

        sb.append(c.toMIPS());

        System.out.println("#########   remet le bon id : "+ id);

        TDS.getInstance().setId(id);
        sb.append("\n sw $v0, ");
        sb.append(var.getDeplacement());
        sb.append("($s7)\n\n");

        return sb.toString();
    }

    public void verifier() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(var);
        sb.append(" = ");
        sb.append(classe);
        sb.append("\n");

        return sb.toString();
    }

}
