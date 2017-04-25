package plic.arbre;

import plic.declarations.Declaration;
import plic.tds.Idf;
import plic.tds.TDC;
import plic.tds.TDS;

/**
 * Created by simon on 14/02/17.
 */
public class Classe extends Declaration {


    private Idf nom;
    private BlocDeDeclarations declarations;

    public Classe(Idf nom, BlocDeDeclarations declarations, int no) {
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

        sb.append("Classe : " + nom + " { \n");
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
