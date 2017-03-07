package plic.arbre;

import plic.arbre.expression.Expression;
import plic.declarations.DeclarationConstante;

public abstract class Boucle extends DeclarationConstante {



    /**
     * Juste avec un bloc dans si, pas de sinon
     * @param no
     * @param e
     * @param bdsi
     */
    public Boucle(int no) {
        super(no);
        
    }


    @Override
    public void verifier() {

    }

    @Override
    public abstract String toMIPS(); 

}
