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
        // Si la chaine n'est pas dans la table, on l'ajoute
        if (!chaineLabel.containsKey(chaine)) {
            String label = "label_str_" + Integer.toString(compteur);
            compteur++;
            chaineLabel.put(chaine, label);
        }
    }

    public String getLabelFromString(String s) {
        return chaineLabel.get(s);
    }

    public String generateMIPS() {
        StringBuilder sb = new StringBuilder();

        for (String s : chaineLabel.keySet()) {
            sb.append(chaineLabel.get(s));
            sb.append("\n.asciiz ");
            sb.append(s);
            sb.append("\n\n");
        }

        return sb.toString();
    }
}
