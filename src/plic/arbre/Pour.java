package plic.arbre;

import plic.arbre.expression.Expression;
import plic.tds.Idf;

/**
 * Created by simon on 13/03/17.
 */
public class Pour extends Boucle {

    private Idf idf1;
    private Expression exp1;//Initialisation ex i=0
    private Expression exp2;//Condition
    private Expression exp3;//Incrémentation
    BlocDinstructions bloc;

    /**
     * @param no
     */
    public Pour(int no, Idf idf1, Expression exp1, Expression exp2, Expression exp3, BlocDinstructions bloc) {
        super(no);
        this.idf1 = idf1;
        this.exp1 = exp1;
        this.exp3 = exp3;
        this.exp2 = exp2;
        this.bloc = bloc;


    }


    @Override
    public String toMIPS() {
        //Maintenant dans $v0 on a le resultat de l'expression
        StringBuilder strb = new StringBuilder();
        //Initialisation boucle
        strb.append(exp1.toMIPS());
        strb.append("pour" + noLigne + ": \n");

        strb.append(exp2.toMIPS());
        strb.append("beq $v0, $0, fpour" + noLigne + "\n");
        //Bloc de l'iteration du tant que
        strb.append(bloc.toMIPS());


        strb.append(exp3.toMIPS());//On incrémente
        strb.append("j pour" + noLigne + "\n");//On remonte dans la condition

        //Bloc de fin du pour
        strb.append("fpour" + noLigne + ": \n");

        return strb.toString();
    }

}
