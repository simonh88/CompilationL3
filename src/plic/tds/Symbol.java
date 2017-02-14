package plic.tds;

/**
 * Created by antoine on 12/02/17.
 */
public class Symbol {


    private String statut;
    private String type;
    private int deplacement;

    public Symbol(String statut, String type){
        this.statut = statut;
        this.type = type;
        this.deplacement = TDS.getInstance().getTailleZoneDesVariables();;
    }

    public String getStatut() {
        return this.statut;
    }

    public String getType() {
        return this.type;
    }

    public int getDeplacement() {
        return this.deplacement;
    }
}
