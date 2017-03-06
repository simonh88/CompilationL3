package plic.arbre;

import plic.arbre.expression.Expression;
import plic.declarations.DeclarationConstante;

public abstract class Boucle extends DeclarationConstante {

	private Expression condition;
    private BlocDinstructions bloc;

    /**
     * Juste avec un bloc dans si, pas de sinon
     * @param no
     * @param e
     * @param bdsi
     */
    public Boucle(int no, Expression e, BlocDinstructions b) {
        super(no);
        condition = e;
        bloc = b;
    }


    @Override
    public void verifier() {

    }

    @Override
    public abstract String toMIPS(); 

}
