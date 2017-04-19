package plic.tds;

import plic.exceptions.DoubleDeclarationException;
import plic.exceptions.VariableNonDeclareeException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by antoine on 12/02/17.
 */
public class TDS {

    private static TDS instance;

    //TODO a enlever plus tard du coup puisque maintenant on a la TDSLocale
    private HashMap<Entree, Symbol> hmap;

    private static TDSLocale tdsCourante;
    private ArrayList<TDSLocale> tdsLocales;

    private TDS() {
        this.hmap = new HashMap<>();//A enlever aussi
        tdsLocales = new ArrayList<>();
        TDSLocale blocHaut = new TDSLocale();
        tdsLocales.add(blocHaut);
    }

    public static TDS getInstance() {
        if (instance == null) {
            instance = new TDS();
        }
        return instance;
    }




    //TODO Entrer bloc et sortie bloc à faire (fonctions)

    public void entreeBloc(){
    	//On crée une nouvelle tds
    	TDSLocale t = new TDSLocale();
    	//On set le pere de la nouvelle tds
    	t.setPere(tdsCourante);
    	//On ajouter la nouvelle tds comme fils de la tdsCourante
    	tdsCourante.ajouterFils(t);
    	//On ajoute a notre table des tds cette tds ajouter
    	tdsLocales.add(t);
    	//On positionne la tdsCourante a la nouvelle TDSLocale cree
    	tdsCourante = t;
    }
    
    public void sortieBloc(){
    	//On remet la tdsCourante a la tds parente de la tdsCourante 
    	tdsCourante = tdsCourante.getPere();
    }


    //TODO A remodifier pour créer une tdsLOcale et penser au check
    public void ajouter(Entree entree, Symbol symbol) {
        tdsCourante.ajouter(entree, symbol);
    }

    /**
     * FOnction qu'il faut refaire dans la tdsLOcale
     * @return
     */
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


    /**
     * Ici, identifier doit chercher dans les tdsLocales, et rechercher dans le parent si cela est vide.
     * @param e
     * @param noligne
     * @return
     */
    public Symbol identifier(Entree e, int noligne) {
        if (tdsCourante.getHmap().get(e) == null && tdsCourante.getPere().getHmap().get(e) == null) throw new VariableNonDeclareeException(e.toString(), noligne);
        if (tdsCourante.getHmap().get(e) == null)
        	return tdsCourante.getPere().getHmap().get(e);
        else
        	return tdsCourante.getHmap().get(e);
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
