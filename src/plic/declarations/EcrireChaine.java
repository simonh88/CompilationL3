package plic.declarations;

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
        return "tomips";
    }

    public void verifier() {

    }

    public String toString() {
        return "ecrireChaine";
    }
}
