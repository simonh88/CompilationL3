package plic.arbre;

import plic.declarations.Declaration;
import plic.exceptions.AnalyseException;
import plic.tds.TDC;
import plic.tds.TDS;

import java.util.ArrayList;

/**
 * Created by antoine on 24/04/17.
 */
public class BlocDeClasses extends ArbreAbstrait{


    protected ArrayList<Classe> classes;

    public BlocDeClasses(int n) {
        super(n);
        classes = new ArrayList<Classe>();
    }

    public void ajouter(Classe c) {
        classes.add(c);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Classe c : classes) {
            sb.append("\n\n");
            sb.append(c.toMIPS());
        }

        return sb.toString();
    }

    public String toMIPS() {
        StringBuilder sb = new StringBuilder();



        sb.append(this.header());

        for (Classe c : classes) {
            sb.append("\n\n");
            sb.append(c.toMIPS());
        }



        sb.append(this.footer());
        sb.append(this.error_div_0());

        return sb.toString();
    }

    public void verifier() throws AnalyseException {
        for (Classe c : classes) {
            c.verifier();
        }
    }

    private String header() {
        StringBuilder sb = new StringBuilder();

        sb.append(".data\n");
        sb.append("str_div_by_0:\t.asciiz \"ERREUR D'EXECUTION : Division par zero interdite\" \n");
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

}


