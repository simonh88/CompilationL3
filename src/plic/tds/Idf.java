package plic.tds;

/**
 * Created by simon on 14/02/17.
 */
public class Idf {
    private String nom;
    private int noligne;


    public Idf(String nom, int noligne) {
        this.nom = nom;
        this.noligne = noligne;
    }


    public void verifier() {
        TDS.getInstance().identifier(new Entree(nom), noligne);
    }


    public int getDeplacement() {
        return TDS.getInstance().identifier(new Entree(nom), noligne).getDeplacement();
    }

    public Symbol getSymbole() {
        return TDS.getInstance().identifier(new Entree(nom), noligne);
    }

    public String getNom() {
        return nom;
    }

    public String toString() {
        return nom;
    }
}
