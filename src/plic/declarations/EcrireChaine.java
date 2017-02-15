package plic.declarations;

import plic.tds.TDC;

/**
 * Created by simon on 14/02/17.
 */
public class EcrireChaine extends Ecrire {

    private String texte;


    public EcrireChaine(String texte, int no) {
        super(no);
        this.texte = texte;
    }


    public String toMIPS() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n li $v0, 4\n");
        sb.append("la $a0, ");
        sb.append(TDC.getInstance().getLabelFromString(this.texte));
        sb.append("\nsyscall\n\n");

        return sb.toString();

    }

    public void verifier() {
    	
    }

    public String toString() {
        return "ecrireChaine";
    }
}
