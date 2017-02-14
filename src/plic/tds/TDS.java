package plic.tds;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by antoine on 12/02/17.
 */
public class TDS {

    private static TDS instance;
    private HashMap<Entree, Symbol> hmap;

    private TDS(){
        this.hmap = new HashMap<>();
    }

    public static TDS getInstance(){
        if (instance==null){
            instance = new TDS();
        }
        return instance;
    }

    public void ajouter(Entree entree, Symbol symbol){
        //if(this.hmap.has(entree)) throws DoubleDeclaration ...

        this.hmap.put(entree, symbol);
    }

    public int getTailleZoneDesVariables(){
        int size = 0;

        for(Map.Entry<Entree, Symbol> entry : this.hmap.entrySet()) {
            Entree e = entry.getKey();
            Symbol s = entry.getValue();

            size += s.getDeplacement();
        }

        return size;
    }

    public Symbol identifier(Entree e, int noligne){
        Symbol s = hmap.get(e);
        if (s == null); //TODO THROW NEW EXCEPT
        return s;
    }
}
