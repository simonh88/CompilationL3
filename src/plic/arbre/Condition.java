package plic.arbre;

import plic.arbre.expression.Expression;

/**
 * Created by simon on 06/03/17.
 */
public class Condition extends ArbreAbstrait {


    private Expression condition;
    private BlocDinstructions blocSi;
    private BlocDinstructions blocSinon;

    /**
     * Juste avec un bloc dans si, pas de sinon
     * @param no
     * @param e
     * @param bdsi
     */
    protected Condition(int no, Expression e, BlocDinstructions bdsi) {
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
    protected Condition(int no, Expression e, BlocDinstructions bdsi, BlocDinstructions bdsinon) {
        super(no);
        condition = e;
        blocSi = bdsi;
        blocSinon = bdsinon;
    }

    @Override
    public void verifier() {

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
        strb.append("j fsi"+noLigne);//On va a la fin
        //Bloc du sinon
        strb.append("sinon"+noLigne+": \n");
        if(blocSinon != null) strb.append(blocSinon.toMIPS());
        strb.append("fsi"+noLigne+":\n");
        //Sortie du si

        return strb.toString();
    }
}
