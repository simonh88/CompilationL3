package plic.arbre;

import plic.declarations.Declaration;
import plic.declarations.Instruction;
import plic.tds.Idf;
import plic.tds.TDS;

/**
 * Created by antoine on 25/04/17.
 */
public class Fonction extends Instruction {

    private Idf nom;
    private BlocDeDeclarations declarations;

    public Fonction(int no, Idf nom, BlocDeDeclarations declarations) {
        super(no);
        this.nom = nom;
        this.declarations = declarations;
    }

    public String toMIPS() {
        StringBuilder sb = new StringBuilder();

        sb.append(declarations.toMIPS());

        return sb.toString();
    }



    public void verifier() {

        TDS.getInstance().toString();
        declarations.verifier();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Fonction : " + nom + " { \n");
        if (declarations == null) {
            sb.append("#Corps vide#\n");
        } else {
            sb.append(declarations);
        }
        sb.append("}\n");

        return sb.toString();
    }

    public String getNom(){
        return this.nom.getNom();
    }
}
