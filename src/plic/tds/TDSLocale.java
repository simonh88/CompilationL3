package plic.tds;

import plic.exceptions.DoubleDeclarationException;
import plic.exceptions.VariableNonDeclareeException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe représentant le stockage des blocs et de leurs variables
 * une tdsLocale ou un bloc connait son parent pour pouvoir parcourir
 * toutes ces dernières sous forme d'arbre afin de déterminer si la variable
 * est définie ou non
 */
public class TDSLocale {

    /**
     * Structure en arbre avec les parents, voir TD du 8/1/17
     * On saura les numéros dans la TDS "principale" avec les indices de l'arrayList
     */

    private HashMap<Entree, Symbol> hmap;
    //Si le parent est nul c'est que c'est le bloc Principal
    private TDSLocale parent;
    private ArrayList<TDSLocale> fils;
    private int base;

    private int id;


    public TDSLocale(int id) {
        this.hmap = new HashMap<>();
        this.fils = new ArrayList<TDSLocale>();
        this.parent = null;
        this.base = 0;

        this.id = id;
    }


    /**
     * L'identifier là doit chercher uniquement dans sa tdsLocale
     * S'il ne retourne rien, on regarde dans les parents pour voir si la variable est
     * déjà définie ou non
     *
     * @param e
     * @param noligne
     * @return
     */
    public Symbol identifier(Entree e, int noligne) {

        if (hmap.get(e) != null) {
            return hmap.get(e);
        } else {
            if (this.getPere() != null) {
                return this.getPere().identifier(e, noligne);
            } else {
                return null;
            }
        }
    }

    /**
     * Penser à faire les vérifs de double décalations etc..
     *
     * @param entree
     * @param symbol
     */
    public void ajouter(Entree entree, Symbol symbol) {

        if (this.hmap.containsKey(entree))
            throw new DoubleDeclarationException("Multiple déclarations de la variable : " + entree.toString());

        //System.out.println("Ajout : " + entree.getNom() + " - " + symbol.toString());

        this.hmap.put(entree, symbol);

        //System.out.println(this.toString());
    }


    public HashMap<Entree, Symbol> getHmap() {
        return hmap;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Entree, Symbol> entry : this.hmap.entrySet()) {
            Entree e = entry.getKey();
            Symbol s = entry.getValue();

            sb.append("\n### Entree : ");
            sb.append(e.toString());
            sb.append(" - Symbol : ");
            sb.append(s.toString());
        }

        return sb.toString();
    }

    public void setPere(TDSLocale t) {
        this.parent = t;
    }

    public TDSLocale getPere() {
        return this.parent;
    }

    public void ajouterFils(TDSLocale t) {
        this.fils.add(t);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
