package plic.tds;

/**
 * Created by antoine on 12/02/17.
 */
public class Symbol {

    private String statut;
    private String type;
    private int deplacement;

    public Symbol(String statut, String type, int deplacement){
        this.statut = statut;
        this.type = type;
        this.deplacement = deplacement;
    }

    public String getStatut() {
        return statut;
    }

    public String getType() {
        return type;
    }

    public int getDeplacement() {
        return deplacement;
    }
}
