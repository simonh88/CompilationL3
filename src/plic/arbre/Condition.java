package plic.arbre;

import plic.arbre.expression.Expression;
import plic.declarations.DeclarationConstante;

/**
 * Created by simon on 06/03/17.
 */
public class Condition extends DeclarationConstante {


    private Expression condition;
    private BlocDeDeclarations blocSi;
    private BlocDeDeclarations blocSinon;

    /**
     * Juste avec un bloc dans si, pas de sinon
     * @param no
     * @param e
     * @param bdsi
     */
    public Condition(int no, Expression e, BlocDeDeclarations bdsi) {
        super(no);
        condition = e;
        blocSi = bdsi;
    }


    /**
     * Avec un bloc dans le si et dans le sinon
     * @param no
     * @param e
     * @param bdsi
     * @param bdsinon
     */
    public Condition(int no, Expression e, BlocDeDeclarations bdsi, BlocDeDeclarations bdsinon) {
        super(no);
        condition = e;
        blocSi = bdsi;
        blocSinon = bdsinon;
    }

    @Override
    public void verifier() {
        condition.verifier();
        blocSi.verifier();
        blocSinon.verifier();
    }

    @Override
    public String toMIPS() {
        //Maintenant dans $v0 on a le resultat de l'expression
        StringBuilder strb = new StringBuilder();
        //COndition si
        strb.append(condition.toMIPS());
        strb.append("beq $v0, $0, sinon"+noLigne+"\n");
        //Bloc du si
        strb.append(blocSi.toMIPS());
        strb.append("j fsi"+noLigne+"\n");//On va a la fin
        //Bloc du sinon
        strb.append("sinon"+noLigne+": \n");
        if(blocSinon != null) strb.append(blocSinon.toMIPS());
        strb.append("fsi"+noLigne+":\n");
        //Sortie du si

        return strb.toString();
    }
}
