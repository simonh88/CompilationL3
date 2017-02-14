package plic.arbre;

import plic.tds.Idf;
import plic.tds.TDC;
import plic.tds.TDS;

/**
 * Created by simon on 14/02/17.
 */
public class Classe extends ArbreAbstrait {


    private Idf nom;
    private BlocDeDeclarations declarations;

    public Classe(Idf nom, BlocDeDeclarations declarations, int no) {
        super(no);
        this.nom = nom;
        this.declarations = declarations;
    }

    public String toMIPS() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.header());

        sb.append(declarations.toMIPS());

        sb.append(this.footer());
        sb.append(this.error_div_0());

        return sb.toString();
    }

    private String header() {
        StringBuilder sb = new StringBuilder();

        sb.append(".data\n");
        sb.append("str_div_by_0:\t.asciiz \"Exception : Division par zero interdite\" \n");
        sb.append(TDC.getInstance().generateMIPS());
        sb.append(".text\n");
        sb.append("main :\n");
        sb.append("move $s7,$sp\n");
        sb.append("addi $sp, $sp, ");
        sb.append(TDS.getInstance().getTailleZoneDesVariables());
        sb.append("\n\n");

        return sb.toString();
    }

    private String footer() {
        StringBuilder sb = new StringBuilder();

        sb.append("end :\n");
        sb.append("move $v1, $v0\n");
        sb.append("li $v0, 10\n");
        sb.append("syscall\n\n");

        return sb.toString();
    }

    private String error_div_0() {
        StringBuilder sb = new StringBuilder();

        sb.append("print_exception_div_zero:\n");
        sb.append("li $v0, 4\n");
        sb.append("la $a0, str_div_by_0\n");
        sb.append("syscall\n");
        sb.append("b end\n\n");

        return sb.toString();
    }

    public void verifier() {
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
}
