package plic.arbre;

import plic.declarations.Declaration;
import plic.exceptions.AnalyseException;

import java.util.ArrayList;

/**
 * Created by simon on 14/02/17.
 */
public class BlocDeDeclarations extends ArbreAbstrait{


    protected ArrayList<Declaration> declarations ;

    public BlocDeDeclarations(int n) {
        super(n) ;
        declarations = new ArrayList<>();
    }

    public void ajouter(Declaration d) {
        declarations.add(d);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder() ;
        for (Declaration d : declarations) {
            sb.append("\t");
            sb.append(d);
        }
        return sb.toString();
    }

    public String toMIPS() {
        StringBuilder sb = new StringBuilder();
        for (Declaration d : declarations) {
            sb.append(d.toMIPS());
        }
        return sb.toString();
    }

    public void verifier() throws AnalyseException {
        for (Declaration d : declarations) {
            d.verifier();
        }
    }

}
