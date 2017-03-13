package plic.arbre;

import plic.arbre.expression.Expression;

public class TantQue extends Boucle {
	
	private Expression condition;
    private BlocDeDeclarations bloc;
    
	public TantQue(int no, Expression e, BlocDeDeclarations b) {
		super(no);
		condition = e;
        bloc = b;
	}

	@Override
	public String toMIPS() {
		 //Maintenant dans $v0 on a le resultat de l'expression
        StringBuilder strb = new StringBuilder();
        //Bloc de la verification du tant que 
        strb.append("tant"+noLigne+": \n");
        
        strb.append(condition.toMIPS());
        strb.append("beq $v0, $0, ftant"+noLigne+"\n");
        //Bloc de l'iteration du tant que 
        strb.append("iter"+noLigne+": \n");
        strb.append(bloc.toMIPS());
        strb.append("j tant"+noLigne+"\n");//On remonte dans la condition
        //Bloc de fin du tant que 
        strb.append("ftant"+noLigne+": \n");
        
        return strb.toString();
	}

    @Override
    public void verifier() {
        condition.verifier();
        bloc.verifier();
    }

}
