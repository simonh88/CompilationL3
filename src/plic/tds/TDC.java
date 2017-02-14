package plic.tds;

import java.util.HashMap;

/**
 * Created by simon on 14/02/17.
 */
public class TDC {

    private static TDC instance;

    public static TDC getInstance() {
        if (instance == null) {
            instance = new TDC();
        }
        return instance;
    }

    // Hashmap Chaine de caractère -> label correspondant
    private HashMap<String, String> chaineLabel;
    private int compteur;

    private TDC() {
        chaineLabel = new HashMap<>();
        compteur = 0;
    }

    public void ajouter(String chaine) {
        String label = "label_str_" + Integer.toString(compteur);
        compteur++;

        // Si la chaine n'est pas dans la table, on l'ajoute
        if (!chaineLabel.containsKey(chaine)) {
            chaineLabel.put(chaine, label);
        }
    }

    public String getLabelFromString(String str) {
        return chaineLabel.get(str);
    }

    public String generateMIPS() {
        StringBuilder sb = new StringBuilder();
        for (String s : chaineLabel.keySet()) {
            sb.append(String.format("%s:\t.asciiz %s\n", chaineLabel.get(s), s));
        }
        return sb.toString();
    }
}
