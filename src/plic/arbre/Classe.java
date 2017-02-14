package plic.arbre;

import plic.tds.Idf;
import plic.tds.TDC;
import plic.tds.TDS;

/**
 * Created by simon on 14/02/17.
 */
public class Classe extends ArbreAbstrait{


    private Idf nom;
    private BlocDeDeclarations declarations;

    public Classe(Idf nom, BlocDeDeclarations declarations, int no) {
        super(no);
        this.nom = nom;
        this.declarations = declarations;
    }

    public String toMIPS() {
        StringBuilder sb = new StringBuilder();
        sb.append(".data\n\n");
        // TODO : Stockage des chaines de caractrères dans une section .data
        sb.append("str_div_by_0:\t.asciiz \"Exception : Division par zero\" \n");
        sb.append(TDC.getInstance().generateMIPS());

        sb.append("\n.text\n\nmain:\n");
        sb.append("\t# Initialisation de s7\n");
        sb.append("\tmove $s7, $sp\n");
        sb.append("\t# Allocation de mémoire pour les variables du bloc\n");
        sb.append(String.format("\taddi $sp, $sp, %d\n", TDS.getInstance().getTailleZoneDesVariables()));

        sb.append(declarations.toMIPS());

        // Fin du programme :
        sb.append("end:\n\tmove $v1, $v0\n\tli $v0, 10\n\tsyscall\n");
        sb.append("print_exception_div_zero:\n");
        sb.append("\tli $v0, 4\n");
        sb.append("\tla $a0, str_div_by_0\n");
        sb.append("\tsyscall\n");
        sb.append("\tb end\n");
        return sb.toString();
    }

    public void verifier() {
        declarations.verifier();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("classe " + nom + " { \n");
        if (declarations != null) {
            sb.append(declarations);
        } else {
            sb.append("#Corps vide#\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
}
