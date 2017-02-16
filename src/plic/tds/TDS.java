package plic.tds;

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
        //TODO THROW DOUBLEDECLARATION
        //if(this.hmap.has(entree)) throws DoubleDeclaration ...

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

        return -(hmap.size() * 4);
    }

    public Symbol identifier(Entree e, int noligne) {

        System.out.println(toString());
        System.out.println(hmap.size());

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
