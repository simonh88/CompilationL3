package plic.arbre;

import plic.arbre.expression.AccesVariable;
import plic.arbre.expression.Expression;
import plic.declarations.Affectation;
import plic.tds.Idf;

/**
 * Created by simon on 13/03/17.
 */
public class Pour extends Boucle {

    private Affectation af1;
    private Expression exp1;//Initialisation ex i=0
    private Expression exp2;//Condition
    private Affectation af2;//Incrémentation
    BlocDinstructions bloc;

    /**
     * @param no
     */
    public Pour(int no, Affectation af1, Expression exp2, Affectation af2, BlocDinstructions bloc) {
        super(no);
        this.af1 = af1;
        this.af2 = af2;
        this.exp2 = exp2;
        this.bloc = bloc;


    }


    @Override
    public String toMIPS() {
        //Maintenant dans $v0 on a le resultat de l'expression
        StringBuilder strb = new StringBuilder();
        //Initialisation boucle
        strb.append(af1.toMIPS());
        strb.append("pour" + noLigne + ": \n");

        strb.append(exp2.toMIPS());
        strb.append("beq $v0, $0, fpour" + noLigne + "\n");
        //Bloc de l'iteration du tant que
        strb.append(bloc.toMIPS());


        strb.append(af2.toMIPS());//On incrémente
        strb.append("j pour" + noLigne + "\n");//On remonte dans la condition

        //Bloc de fin du pour
        strb.append("fpour" + noLigne + ": \n");

        return strb.toString();
    }

    @Override
    public void verifier() {
        af1.verifier();
        exp1.verifier();
        exp2.verifier();
        af2.verifier();
        bloc.verifier();
    }

}
