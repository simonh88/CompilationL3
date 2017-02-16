package plic.tds;

/**
 * Created by antoine on 12/02/17.
 */
public class Entree {

    private String nom;

    public Entree (String s){
        this.nom = s ;
    }

    public String getNom() {
        return nom;
    }

    public String toString(){
        return nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entree entree = (Entree) o;

        return nom != null ? nom.equals(entree.nom) : entree.nom == null;

    }

    @Override
    public int hashCode() {
        return nom != null ? nom.hashCode() : 0;
    }
}
