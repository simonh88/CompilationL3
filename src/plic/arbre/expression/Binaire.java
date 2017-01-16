package plic.arbre.expression;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public abstract class Binaire extends Expression {
    
    protected Expression gauche ;
    protected Expression droite ;

    protected Binaire(Expression gauche, Expression droite) {
        super(gauche.getNoLigne());
        this.gauche = gauche;
        this.droite = droite;
    }
    
    public abstract String operateur() ;

    @Override
    public String toString() {
        return "(" + gauche + operateur() + droite + ")" ;
    }

    @Override
    public String toMIPS()
    {
        StringBuilder strb = new StringBuilder();
        //On charge la valeur de gauche dans v0
        strb.append(gauche.toMIPS());
        //v0 dans t8
        strb.append("move $t8, $v0\n");
        //charge la valeur de droite dans v0
        strb.append(droite.toMIPS());
        //On différencie les cas
        switch(this.operateur()){
            //COMPARAISON
            case "==":
                strb.append("seq $v0, $v0, $t8\n");
                break;
            case "!=":
                strb.append("sne $v0, $v0, $t8\n");
                break;
            case " > ":
                strb.append("sgt $v0, $t8, $v0\n");
                break;
            case " < ":
                strb.append("slt $v0, $t8, $v0\n");
                break;
            //BINAIRE ARITHMETIQUE
            case " - ":
                strb.append("sub $v0, $t8, $v0\n");
                break;
            case " + ":
                strb.append("add $v0, $t8, $v0\n");
                break;
            case " * ":
                strb.append("mul $v0, $t8, $v0\n");
                break;
            case " / ":
                strb.append("div $v0, $t8, $v0\n");
                break;
            //BINAIRE LOGIQUE
            case " et ":
                strb.append("and $v0, $t8, $v0\n");
                break;
            case " ou ":
                strb.append("or $v0, $t8, $v0\n");
                break;
        }
        return strb.toString();
    }

}
