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


    private static TDSLocale tdsCourante;
    private ArrayList<TDSLocale> tdsLocales;
    private boolean firstClass;
    private int tailleZoneDesVariables;

    private int countVar;
    private int nbVar;

    private int id;

    private TDS() {
        tdsLocales = new ArrayList<>();
        TDSLocale blocHaut = new TDSLocale(0);
        tdsLocales.add(blocHaut);
        tdsCourante = blocHaut;
        firstClass = false;
        id = 0;
        tailleZoneDesVariables = 12;
        countVar = 0;
        nbVar = 0;
    }

    public static TDS getInstance() {
        if (instance == null) {
            instance = new TDS();
        }

        return instance;
    }


    //TODO Entrer bloc et sortie bloc à faire (fonctions)

    public void entreeBloc() {

        System.out.println("EntreeBloc " + (id + 1) + "\n");

        //On crée une nouvelle tds
        id++;
        TDSLocale t = new TDSLocale(id);
        //On set le pere de la nouvelle tds
        t.setPere(tdsCourante);
        //On ajouter la nouvelle tds comme fils de la tdsCourante
        tdsCourante.ajouterFils(t);
        //On ajoute a notre table des tds cette tds ajouter
        tdsLocales.add(t);
        //On la déplace a sa mémoire allouée
        t.setBase(0);
        //On positionne la tdsCourante a la nouvelle TDSLocale cree
        tdsCourante = t;
    }

    public void sortieBloc() {
        System.out.println("SortieBloc " + id + " \n");
        //On remet la tdsCourante a la tds parente de la tdsCourante
        tdsCourante = tdsCourante.getPere();
    }


    //TODO A remodifier pour créer une tdsLOcale et penser au check
    public void ajouter(Entree entree, Symbol symbol) {

        tdsCourante.ajouter(entree, symbol);
        TDV.getInstance().add(id);
        nbVar++;

        tailleZoneDesVariables += 4;
    }


    /**
     * Ici, identifier doit chercher dans les tdsLocales, et rechercher dans le parent si cela est vide.
     *
     * @param e
     * @param noligne
     * @return
     */
    public Symbol identifier(Entree e, int noligne) {

        /*System.out.println("____________________________________________");
        System.out.println("countVar : " + countVar + " - nbVar : " + nbVar);

        System.out.println("         : "+countVar%nbVar);

        int TDSid = TDV.getInstance().get(countVar%nbVar);
        countVar++;*/

        int TDSid = id;

        System.out.println("TDS : " + TDSid + " - Identifier : \n");

        Symbol res = tdsLocales.get(TDSid).identifier(e, noligne);

        System.out.println(tdsLocales.get(TDSid).toString() + "\n\n");

        if (res == null) throw new VariableNonDeclareeException(e.toString(), noligne);

        return res;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();


        return sb.toString();
    }

    public boolean isFirstClass() {
        return firstClass;
    }

    public void setFirstClass(boolean firstClass) {
        this.firstClass = firstClass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public int getTailleZoneDesVariables() {
        return tailleZoneDesVariables;
    }

    public void setTailleZoneDesVariables(int tailleZoneVariables) {
        this.tailleZoneDesVariables = tailleZoneVariables;
    }
}
