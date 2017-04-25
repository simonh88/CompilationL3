package plic.tds;

import java.util.*;

/**
 * Created by antoine on 25/04/17.
 */


/**
 * Table des Variables
 *
 * Stockdans l'ordre de déclaration des variables l'id de la TDSLocale dans laquele ele se trouve
 */
public class TDV {

    private static TDV instance;

    private ArrayList<Integer> pile;

    private TDV(){
        this.pile = new ArrayList<>();
    }

    public void add(int id){
        this.pile.add(id);
    }

    public int get(int id){

        if(this.pile.size() <= 0) return 0;

        return this.pile.get(id);
    }

    public static TDV getInstance(){
        if (instance == null) {
            instance = new TDV();
        }

        return instance;
    }
}
