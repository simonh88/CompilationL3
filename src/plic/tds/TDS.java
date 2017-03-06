package plic.tds;

import plic.exceptions.DoubleDeclarationException;
import plic.exceptions.VariableNonDeclareeException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by antoine on 12/02/17.
 */
public class TDS {

    private static TDS instance;
    private HashMap<Entree, Symbol> hmap;

    private TDS() {
        this.hmap = new HashMap<>();
    }

    public static TDS getInstance() {
        if (instance == null) {
            instance = new TDS();
        }
        return instance;
    }

    public void ajouter(Entree entree, Symbol symbol) {
        if(this.hmap.containsKey(entree)) throw new DoubleDeclarationException("Multiple déclarations de la variable : "+entree.toString());

        this.hmap.put(entree, symbol);
    }

    public int getTailleZoneDesVariables() {
        /*int size = 0;

        for(Map.Entry<Entree, Symbol> entry : this.hmap.entrySet()) {
            Entree e = entry.getKey();
            Symbol s = entry.getValue();

            size += s.getDeplacement();
        }

        return size;*/

        //TODO MODIF QUAND ON IMPLEMENTERA LES AUTRES TYPES
        return -(hmap.size() * 4);
    }

    public Symbol identifier(Entree e, int noligne) {
        if (hmap.get(e) == null) throw new VariableNonDeclareeException(e.toString(), noligne);
        return hmap.get(e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Entree, Symbol> entry : this.hmap.entrySet()) {
            Entree e = entry.getKey();
            Symbol s = entry.getValue();

            sb.append("Entree : ");
            sb.append(e.toString());
            sb.append(" - Symbol : ");
            sb.append(s.toString());
        }

        return sb.toString();
    }
}
